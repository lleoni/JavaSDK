/*
 * Copyright (C) 2016 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.sdk.margin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

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
 * Result from the service.
 */
@BeanDefinition(builderScope = "private", metaScope = "private", factoryName = "of")
public final class MarginCalcResult implements ImmutableBean {

  /**
   * The status of the calculation - PENDING or COMPLETED.
   */
  @PropertyDefinition(validate = "notNull")
  private final MarginCalcResultStatus status;
  /**
   * The type of calculation.
   */
  @PropertyDefinition(validate = "notNull")
  private final MarginCalcRequestType type;
  /**
   * The mode of the calculation.
   */
  @PropertyDefinition(validate = "notNull")
  private final MarginCalcMode mode;
  /**
   * The valuation date for which the portfolio will be processed.
   */
  @PropertyDefinition(validate = "notNull")
  private final LocalDate valuationDate;
  /**
   * The reporting currency, as an ISO 4217 three letter currency code.
   */
  @PropertyDefinition(validate = "notNull")
  private final String reportingCurrency;
  /**
   * Whether to apply the client multiplier, as specified in the request.
   */
  @PropertyDefinition(validate = "notNull")
  private final boolean applyClientMultiplier;
  /**
   * The summary of the portfolio items, may be empty.
   */
  @PropertyDefinition(validate = "notNull")
  private final List<PortfolioItemSummary> portfolioItems;
  /**
   * The result of the margin calculation
   */
  @PropertyDefinition(get = "optional")
  private final MarginSummary margin;
  /**
   * The list of failures that occurred, may be empty.
   */
  @PropertyDefinition(validate = "notNull")
  private final List<MarginError> failures;

  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code MarginCalcResult}.
   * @return the meta-bean, not null
   */
  public static MetaBean meta() {
    return MarginCalcResult.Meta.INSTANCE;
  }

  static {
    MetaBean.register(MarginCalcResult.Meta.INSTANCE);
  }

  /**
   * Obtains an instance.
   * @param status  the value of the property, not null
   * @param type  the value of the property, not null
   * @param mode  the value of the property, not null
   * @param valuationDate  the value of the property, not null
   * @param reportingCurrency  the value of the property, not null
   * @param applyClientMultiplier  the value of the property, not null
   * @param portfolioItems  the value of the property, not null
   * @param margin  the value of the property
   * @param failures  the value of the property, not null
   * @return the instance
   */
  public static MarginCalcResult of(
      MarginCalcResultStatus status,
      MarginCalcRequestType type,
      MarginCalcMode mode,
      LocalDate valuationDate,
      String reportingCurrency,
      boolean applyClientMultiplier,
      List<PortfolioItemSummary> portfolioItems,
      MarginSummary margin,
      List<MarginError> failures) {
    return new MarginCalcResult(
      status,
      type,
      mode,
      valuationDate,
      reportingCurrency,
      applyClientMultiplier,
      portfolioItems,
      margin,
      failures);
  }

  private MarginCalcResult(
      MarginCalcResultStatus status,
      MarginCalcRequestType type,
      MarginCalcMode mode,
      LocalDate valuationDate,
      String reportingCurrency,
      boolean applyClientMultiplier,
      List<PortfolioItemSummary> portfolioItems,
      MarginSummary margin,
      List<MarginError> failures) {
    JodaBeanUtils.notNull(status, "status");
    JodaBeanUtils.notNull(type, "type");
    JodaBeanUtils.notNull(mode, "mode");
    JodaBeanUtils.notNull(valuationDate, "valuationDate");
    JodaBeanUtils.notNull(reportingCurrency, "reportingCurrency");
    JodaBeanUtils.notNull(applyClientMultiplier, "applyClientMultiplier");
    JodaBeanUtils.notNull(portfolioItems, "portfolioItems");
    JodaBeanUtils.notNull(failures, "failures");
    this.status = status;
    this.type = type;
    this.mode = mode;
    this.valuationDate = valuationDate;
    this.reportingCurrency = reportingCurrency;
    this.applyClientMultiplier = applyClientMultiplier;
    this.portfolioItems = Collections.unmodifiableList(new ArrayList<>(portfolioItems));
    this.margin = margin;
    this.failures = Collections.unmodifiableList(new ArrayList<>(failures));
  }

  @Override
  public MetaBean metaBean() {
    return MarginCalcResult.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the status of the calculation - PENDING or COMPLETED.
   * @return the value of the property, not null
   */
  public MarginCalcResultStatus getStatus() {
    return status;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the type of calculation.
   * @return the value of the property, not null
   */
  public MarginCalcRequestType getType() {
    return type;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the mode of the calculation.
   * @return the value of the property, not null
   */
  public MarginCalcMode getMode() {
    return mode;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the valuation date for which the portfolio will be processed.
   * @return the value of the property, not null
   */
  public LocalDate getValuationDate() {
    return valuationDate;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the reporting currency, as an ISO 4217 three letter currency code.
   * @return the value of the property, not null
   */
  public String getReportingCurrency() {
    return reportingCurrency;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets whether to apply the client multiplier, as specified in the request.
   * @return the value of the property, not null
   */
  public boolean isApplyClientMultiplier() {
    return applyClientMultiplier;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the summary of the portfolio items, may be empty.
   * @return the value of the property, not null
   */
  public List<PortfolioItemSummary> getPortfolioItems() {
    return portfolioItems;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the result of the margin calculation
   * @return the optional value of the property, not null
   */
  public Optional<MarginSummary> getMargin() {
    return Optional.ofNullable(margin);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the list of failures that occurred, may be empty.
   * @return the value of the property, not null
   */
  public List<MarginError> getFailures() {
    return failures;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      MarginCalcResult other = (MarginCalcResult) obj;
      return JodaBeanUtils.equal(status, other.status) &&
          JodaBeanUtils.equal(type, other.type) &&
          JodaBeanUtils.equal(mode, other.mode) &&
          JodaBeanUtils.equal(valuationDate, other.valuationDate) &&
          JodaBeanUtils.equal(reportingCurrency, other.reportingCurrency) &&
          (applyClientMultiplier == other.applyClientMultiplier) &&
          JodaBeanUtils.equal(portfolioItems, other.portfolioItems) &&
          JodaBeanUtils.equal(margin, other.margin) &&
          JodaBeanUtils.equal(failures, other.failures);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(status);
    hash = hash * 31 + JodaBeanUtils.hashCode(type);
    hash = hash * 31 + JodaBeanUtils.hashCode(mode);
    hash = hash * 31 + JodaBeanUtils.hashCode(valuationDate);
    hash = hash * 31 + JodaBeanUtils.hashCode(reportingCurrency);
    hash = hash * 31 + JodaBeanUtils.hashCode(applyClientMultiplier);
    hash = hash * 31 + JodaBeanUtils.hashCode(portfolioItems);
    hash = hash * 31 + JodaBeanUtils.hashCode(margin);
    hash = hash * 31 + JodaBeanUtils.hashCode(failures);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(320);
    buf.append("MarginCalcResult{");
    buf.append("status").append('=').append(status).append(',').append(' ');
    buf.append("type").append('=').append(type).append(',').append(' ');
    buf.append("mode").append('=').append(mode).append(',').append(' ');
    buf.append("valuationDate").append('=').append(valuationDate).append(',').append(' ');
    buf.append("reportingCurrency").append('=').append(reportingCurrency).append(',').append(' ');
    buf.append("applyClientMultiplier").append('=').append(applyClientMultiplier).append(',').append(' ');
    buf.append("portfolioItems").append('=').append(portfolioItems).append(',').append(' ');
    buf.append("margin").append('=').append(margin).append(',').append(' ');
    buf.append("failures").append('=').append(JodaBeanUtils.toString(failures));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code MarginCalcResult}.
   */
  private static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code status} property.
     */
    private final MetaProperty<MarginCalcResultStatus> status = DirectMetaProperty.ofImmutable(
        this, "status", MarginCalcResult.class, MarginCalcResultStatus.class);
    /**
     * The meta-property for the {@code type} property.
     */
    private final MetaProperty<MarginCalcRequestType> type = DirectMetaProperty.ofImmutable(
        this, "type", MarginCalcResult.class, MarginCalcRequestType.class);
    /**
     * The meta-property for the {@code mode} property.
     */
    private final MetaProperty<MarginCalcMode> mode = DirectMetaProperty.ofImmutable(
        this, "mode", MarginCalcResult.class, MarginCalcMode.class);
    /**
     * The meta-property for the {@code valuationDate} property.
     */
    private final MetaProperty<LocalDate> valuationDate = DirectMetaProperty.ofImmutable(
        this, "valuationDate", MarginCalcResult.class, LocalDate.class);
    /**
     * The meta-property for the {@code reportingCurrency} property.
     */
    private final MetaProperty<String> reportingCurrency = DirectMetaProperty.ofImmutable(
        this, "reportingCurrency", MarginCalcResult.class, String.class);
    /**
     * The meta-property for the {@code applyClientMultiplier} property.
     */
    private final MetaProperty<Boolean> applyClientMultiplier = DirectMetaProperty.ofImmutable(
        this, "applyClientMultiplier", MarginCalcResult.class, Boolean.TYPE);
    /**
     * The meta-property for the {@code portfolioItems} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<List<PortfolioItemSummary>> portfolioItems = DirectMetaProperty.ofImmutable(
        this, "portfolioItems", MarginCalcResult.class, (Class) List.class);
    /**
     * The meta-property for the {@code margin} property.
     */
    private final MetaProperty<MarginSummary> margin = DirectMetaProperty.ofImmutable(
        this, "margin", MarginCalcResult.class, MarginSummary.class);
    /**
     * The meta-property for the {@code failures} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<List<MarginError>> failures = DirectMetaProperty.ofImmutable(
        this, "failures", MarginCalcResult.class, (Class) List.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "status",
        "type",
        "mode",
        "valuationDate",
        "reportingCurrency",
        "applyClientMultiplier",
        "portfolioItems",
        "margin",
        "failures");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -892481550:  // status
          return status;
        case 3575610:  // type
          return type;
        case 3357091:  // mode
          return mode;
        case 113107279:  // valuationDate
          return valuationDate;
        case -1287844769:  // reportingCurrency
          return reportingCurrency;
        case 1555658618:  // applyClientMultiplier
          return applyClientMultiplier;
        case 110493528:  // portfolioItems
          return portfolioItems;
        case -1081309778:  // margin
          return margin;
        case 675938345:  // failures
          return failures;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends MarginCalcResult> builder() {
      return new MarginCalcResult.Builder();
    }

    @Override
    public Class<? extends MarginCalcResult> beanType() {
      return MarginCalcResult.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -892481550:  // status
          return ((MarginCalcResult) bean).getStatus();
        case 3575610:  // type
          return ((MarginCalcResult) bean).getType();
        case 3357091:  // mode
          return ((MarginCalcResult) bean).getMode();
        case 113107279:  // valuationDate
          return ((MarginCalcResult) bean).getValuationDate();
        case -1287844769:  // reportingCurrency
          return ((MarginCalcResult) bean).getReportingCurrency();
        case 1555658618:  // applyClientMultiplier
          return ((MarginCalcResult) bean).isApplyClientMultiplier();
        case 110493528:  // portfolioItems
          return ((MarginCalcResult) bean).getPortfolioItems();
        case -1081309778:  // margin
          return ((MarginCalcResult) bean).margin;
        case 675938345:  // failures
          return ((MarginCalcResult) bean).getFailures();
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
   * The bean-builder for {@code MarginCalcResult}.
   */
  private static final class Builder extends DirectPrivateBeanBuilder<MarginCalcResult> {

    private MarginCalcResultStatus status;
    private MarginCalcRequestType type;
    private MarginCalcMode mode;
    private LocalDate valuationDate;
    private String reportingCurrency;
    private boolean applyClientMultiplier;
    private List<PortfolioItemSummary> portfolioItems = Collections.emptyList();
    private MarginSummary margin;
    private List<MarginError> failures = Collections.emptyList();

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case -892481550:  // status
          return status;
        case 3575610:  // type
          return type;
        case 3357091:  // mode
          return mode;
        case 113107279:  // valuationDate
          return valuationDate;
        case -1287844769:  // reportingCurrency
          return reportingCurrency;
        case 1555658618:  // applyClientMultiplier
          return applyClientMultiplier;
        case 110493528:  // portfolioItems
          return portfolioItems;
        case -1081309778:  // margin
          return margin;
        case 675938345:  // failures
          return failures;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case -892481550:  // status
          this.status = (MarginCalcResultStatus) newValue;
          break;
        case 3575610:  // type
          this.type = (MarginCalcRequestType) newValue;
          break;
        case 3357091:  // mode
          this.mode = (MarginCalcMode) newValue;
          break;
        case 113107279:  // valuationDate
          this.valuationDate = (LocalDate) newValue;
          break;
        case -1287844769:  // reportingCurrency
          this.reportingCurrency = (String) newValue;
          break;
        case 1555658618:  // applyClientMultiplier
          this.applyClientMultiplier = (Boolean) newValue;
          break;
        case 110493528:  // portfolioItems
          this.portfolioItems = (List<PortfolioItemSummary>) newValue;
          break;
        case -1081309778:  // margin
          this.margin = (MarginSummary) newValue;
          break;
        case 675938345:  // failures
          this.failures = (List<MarginError>) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public MarginCalcResult build() {
      return new MarginCalcResult(
          status,
          type,
          mode,
          valuationDate,
          reportingCurrency,
          applyClientMultiplier,
          portfolioItems,
          margin,
          failures);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(320);
      buf.append("MarginCalcResult.Builder{");
      buf.append("status").append('=').append(JodaBeanUtils.toString(status)).append(',').append(' ');
      buf.append("type").append('=').append(JodaBeanUtils.toString(type)).append(',').append(' ');
      buf.append("mode").append('=').append(JodaBeanUtils.toString(mode)).append(',').append(' ');
      buf.append("valuationDate").append('=').append(JodaBeanUtils.toString(valuationDate)).append(',').append(' ');
      buf.append("reportingCurrency").append('=').append(JodaBeanUtils.toString(reportingCurrency)).append(',').append(' ');
      buf.append("applyClientMultiplier").append('=').append(JodaBeanUtils.toString(applyClientMultiplier)).append(',').append(' ');
      buf.append("portfolioItems").append('=').append(JodaBeanUtils.toString(portfolioItems)).append(',').append(' ');
      buf.append("margin").append('=').append(JodaBeanUtils.toString(margin)).append(',').append(' ');
      buf.append("failures").append('=').append(JodaBeanUtils.toString(failures));
      buf.append('}');
      return buf.toString();
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
