/*
 * Copyright (C) 2018 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.sdk.margin;

import java.util.Map;
import java.util.NoSuchElementException;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.PropertyDefinition;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.impl.direct.DirectPrivateBeanBuilder;

/**
 * The value of a single trade in the portfolio.
 */
@BeanDefinition(builderScope = "private", metaScope = "private", factoryName = "of")
public final class TradeValue implements ImmutableBean {

  /**
   * The present value, expressed in the reporting currency.
   */
  @PropertyDefinition(validate = "notNull")
  private final double presentValue;
  /**
   * The trade currency, as an ISO 4217 three letter currency code.
   */
  @PropertyDefinition(validate = "notNull")
  private final String tradeCurrency;
  /**
   * The present value, expressed in the trade currency.
   */
  @PropertyDefinition(validate = "notNull")
  private final double presentValueTradeCurrency;

  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code TradeValue}.
   * @return the meta-bean, not null
   */
  public static MetaBean meta() {
    return TradeValue.Meta.INSTANCE;
  }

  static {
    MetaBean.register(TradeValue.Meta.INSTANCE);
  }

  /**
   * Obtains an instance.
   * @param presentValue  the value of the property, not null
   * @param tradeCurrency  the value of the property, not null
   * @param presentValueTradeCurrency  the value of the property, not null
   * @return the instance
   */
  public static TradeValue of(
      double presentValue,
      String tradeCurrency,
      double presentValueTradeCurrency) {
    return new TradeValue(
      presentValue,
      tradeCurrency,
      presentValueTradeCurrency);
  }

  private TradeValue(
      double presentValue,
      String tradeCurrency,
      double presentValueTradeCurrency) {
    JodaBeanUtils.notNull(presentValue, "presentValue");
    JodaBeanUtils.notNull(tradeCurrency, "tradeCurrency");
    JodaBeanUtils.notNull(presentValueTradeCurrency, "presentValueTradeCurrency");
    this.presentValue = presentValue;
    this.tradeCurrency = tradeCurrency;
    this.presentValueTradeCurrency = presentValueTradeCurrency;
  }

  @Override
  public MetaBean metaBean() {
    return TradeValue.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the present value, expressed in the reporting currency.
   * @return the value of the property, not null
   */
  public double getPresentValue() {
    return presentValue;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the trade currency, as an ISO 4217 three letter currency code.
   * @return the value of the property, not null
   */
  public String getTradeCurrency() {
    return tradeCurrency;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the present value, expressed in the trade currency.
   * @return the value of the property, not null
   */
  public double getPresentValueTradeCurrency() {
    return presentValueTradeCurrency;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      TradeValue other = (TradeValue) obj;
      return JodaBeanUtils.equal(presentValue, other.presentValue) &&
          JodaBeanUtils.equal(tradeCurrency, other.tradeCurrency) &&
          JodaBeanUtils.equal(presentValueTradeCurrency, other.presentValueTradeCurrency);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(presentValue);
    hash = hash * 31 + JodaBeanUtils.hashCode(tradeCurrency);
    hash = hash * 31 + JodaBeanUtils.hashCode(presentValueTradeCurrency);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(128);
    buf.append("TradeValue{");
    buf.append("presentValue").append('=').append(presentValue).append(',').append(' ');
    buf.append("tradeCurrency").append('=').append(tradeCurrency).append(',').append(' ');
    buf.append("presentValueTradeCurrency").append('=').append(JodaBeanUtils.toString(presentValueTradeCurrency));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code TradeValue}.
   */
  private static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code presentValue} property.
     */
    private final MetaProperty<Double> presentValue = DirectMetaProperty.ofImmutable(
        this, "presentValue", TradeValue.class, Double.TYPE);
    /**
     * The meta-property for the {@code tradeCurrency} property.
     */
    private final MetaProperty<String> tradeCurrency = DirectMetaProperty.ofImmutable(
        this, "tradeCurrency", TradeValue.class, String.class);
    /**
     * The meta-property for the {@code presentValueTradeCurrency} property.
     */
    private final MetaProperty<Double> presentValueTradeCurrency = DirectMetaProperty.ofImmutable(
        this, "presentValueTradeCurrency", TradeValue.class, Double.TYPE);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "presentValue",
        "tradeCurrency",
        "presentValueTradeCurrency");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 686253430:  // presentValue
          return presentValue;
        case -50814571:  // tradeCurrency
          return tradeCurrency;
        case -1881703489:  // presentValueTradeCurrency
          return presentValueTradeCurrency;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends TradeValue> builder() {
      return new TradeValue.Builder();
    }

    @Override
    public Class<? extends TradeValue> beanType() {
      return TradeValue.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 686253430:  // presentValue
          return ((TradeValue) bean).getPresentValue();
        case -50814571:  // tradeCurrency
          return ((TradeValue) bean).getTradeCurrency();
        case -1881703489:  // presentValueTradeCurrency
          return ((TradeValue) bean).getPresentValueTradeCurrency();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code TradeValue}.
   */
  private static final class Builder extends DirectPrivateBeanBuilder<TradeValue> {

    private double presentValue;
    private String tradeCurrency;
    private double presentValueTradeCurrency;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 686253430:  // presentValue
          return presentValue;
        case -50814571:  // tradeCurrency
          return tradeCurrency;
        case -1881703489:  // presentValueTradeCurrency
          return presentValueTradeCurrency;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 686253430:  // presentValue
          this.presentValue = (Double) newValue;
          break;
        case -50814571:  // tradeCurrency
          this.tradeCurrency = (String) newValue;
          break;
        case -1881703489:  // presentValueTradeCurrency
          this.presentValueTradeCurrency = (Double) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public TradeValue build() {
      return new TradeValue(
          presentValue,
          tradeCurrency,
          presentValueTradeCurrency);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(128);
      buf.append("TradeValue.Builder{");
      buf.append("presentValue").append('=').append(JodaBeanUtils.toString(presentValue)).append(',').append(' ');
      buf.append("tradeCurrency").append('=').append(JodaBeanUtils.toString(tradeCurrency)).append(',').append(' ');
      buf.append("presentValueTradeCurrency").append('=').append(JodaBeanUtils.toString(presentValueTradeCurrency));
      buf.append('}');
      return buf.toString();
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}