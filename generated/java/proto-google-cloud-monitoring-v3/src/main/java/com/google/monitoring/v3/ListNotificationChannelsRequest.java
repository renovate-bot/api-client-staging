// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The `ListNotificationChannels` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.ListNotificationChannelsRequest}
 */
public  final class ListNotificationChannelsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.ListNotificationChannelsRequest)
    ListNotificationChannelsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNotificationChannelsRequest.newBuilder() to construct.
  private ListNotificationChannelsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNotificationChannelsRequest() {
    name_ = "";
    filter_ = "";
    orderBy_ = "";
    pageSize_ = 0;
    pageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListNotificationChannelsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 24: {

            pageSize_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            filter_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            orderBy_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_ListNotificationChannelsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.ListNotificationChannelsRequest.class, com.google.monitoring.v3.ListNotificationChannelsRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The project on which to execute the request. The format is
   * `projects/[PROJECT_ID]`. That is, this names the container
   * in which to look for the notification channels; it does not name a
   * specific channel. To query a specific channel by REST resource name, use
   * the
   * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation.
   * </pre>
   *
   * <code>string name = 5;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The project on which to execute the request. The format is
   * `projects/[PROJECT_ID]`. That is, this names the container
   * in which to look for the notification channels; it does not name a
   * specific channel. To query a specific channel by REST resource name, use
   * the
   * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation.
   * </pre>
   *
   * <code>string name = 5;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 6;
  private volatile java.lang.Object filter_;
  /**
   * <pre>
   * If provided, this field specifies the criteria that must be met by
   * notification channels to be included in the response.
   * For more details, see [sorting and
   * filtering](/monitoring/api/v3/sorting-and-filtering).
   * </pre>
   *
   * <code>string filter = 6;</code>
   */
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If provided, this field specifies the criteria that must be met by
   * notification channels to be included in the response.
   * For more details, see [sorting and
   * filtering](/monitoring/api/v3/sorting-and-filtering).
   * </pre>
   *
   * <code>string filter = 6;</code>
   */
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDER_BY_FIELD_NUMBER = 7;
  private volatile java.lang.Object orderBy_;
  /**
   * <pre>
   * A comma-separated list of fields by which to sort the result. Supports
   * the same set of fields as in `filter`. Entries can be prefixed with
   * a minus sign to sort in descending rather than ascending order.
   * For more details, see [sorting and
   * filtering](/monitoring/api/v3/sorting-and-filtering).
   * </pre>
   *
   * <code>string order_by = 7;</code>
   */
  public java.lang.String getOrderBy() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderBy_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A comma-separated list of fields by which to sort the result. Supports
   * the same set of fields as in `filter`. Entries can be prefixed with
   * a minus sign to sort in descending rather than ascending order.
   * For more details, see [sorting and
   * filtering](/monitoring/api/v3/sorting-and-filtering).
   * </pre>
   *
   * <code>string order_by = 7;</code>
   */
  public com.google.protobuf.ByteString
      getOrderByBytes() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderBy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <pre>
   * The maximum number of results to return in a single response. If
   * not set to a positive number, a reasonable value will be chosen by the
   * service.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * If non-empty, `page_token` must contain a value returned as the
   * `next_page_token` in a previous response to request the next set
   * of results.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If non-empty, `page_token` must contain a value returned as the
   * `next_page_token` in a previous response to request the next set
   * of results.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pageSize_ != 0) {
      output.writeInt32(3, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, filter_);
    }
    if (!getOrderByBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, orderBy_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pageSize_);
    }
    if (!getPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
    }
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, filter_);
    }
    if (!getOrderByBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, orderBy_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.ListNotificationChannelsRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.ListNotificationChannelsRequest other = (com.google.monitoring.v3.ListNotificationChannelsRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getFilter()
        .equals(other.getFilter());
    result = result && getOrderBy()
        .equals(other.getOrderBy());
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && getPageToken()
        .equals(other.getPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + ORDER_BY_FIELD_NUMBER;
    hash = (53 * hash) + getOrderBy().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListNotificationChannelsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.monitoring.v3.ListNotificationChannelsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The `ListNotificationChannels` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.ListNotificationChannelsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.ListNotificationChannelsRequest)
      com.google.monitoring.v3.ListNotificationChannelsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_ListNotificationChannelsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.ListNotificationChannelsRequest.class, com.google.monitoring.v3.ListNotificationChannelsRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.ListNotificationChannelsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      filter_ = "";

      orderBy_ = "";

      pageSize_ = 0;

      pageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor;
    }

    public com.google.monitoring.v3.ListNotificationChannelsRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.ListNotificationChannelsRequest.getDefaultInstance();
    }

    public com.google.monitoring.v3.ListNotificationChannelsRequest build() {
      com.google.monitoring.v3.ListNotificationChannelsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.ListNotificationChannelsRequest buildPartial() {
      com.google.monitoring.v3.ListNotificationChannelsRequest result = new com.google.monitoring.v3.ListNotificationChannelsRequest(this);
      result.name_ = name_;
      result.filter_ = filter_;
      result.orderBy_ = orderBy_;
      result.pageSize_ = pageSize_;
      result.pageToken_ = pageToken_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.ListNotificationChannelsRequest) {
        return mergeFrom((com.google.monitoring.v3.ListNotificationChannelsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.ListNotificationChannelsRequest other) {
      if (other == com.google.monitoring.v3.ListNotificationChannelsRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (!other.getOrderBy().isEmpty()) {
        orderBy_ = other.orderBy_;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.ListNotificationChannelsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.ListNotificationChannelsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The project on which to execute the request. The format is
     * `projects/[PROJECT_ID]`. That is, this names the container
     * in which to look for the notification channels; it does not name a
     * specific channel. To query a specific channel by REST resource name, use
     * the
     * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation.
     * </pre>
     *
     * <code>string name = 5;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The project on which to execute the request. The format is
     * `projects/[PROJECT_ID]`. That is, this names the container
     * in which to look for the notification channels; it does not name a
     * specific channel. To query a specific channel by REST resource name, use
     * the
     * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation.
     * </pre>
     *
     * <code>string name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The project on which to execute the request. The format is
     * `projects/[PROJECT_ID]`. That is, this names the container
     * in which to look for the notification channels; it does not name a
     * specific channel. To query a specific channel by REST resource name, use
     * the
     * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation.
     * </pre>
     *
     * <code>string name = 5;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project on which to execute the request. The format is
     * `projects/[PROJECT_ID]`. That is, this names the container
     * in which to look for the notification channels; it does not name a
     * specific channel. To query a specific channel by REST resource name, use
     * the
     * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation.
     * </pre>
     *
     * <code>string name = 5;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project on which to execute the request. The format is
     * `projects/[PROJECT_ID]`. That is, this names the container
     * in which to look for the notification channels; it does not name a
     * specific channel. To query a specific channel by REST resource name, use
     * the
     * [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation.
     * </pre>
     *
     * <code>string name = 5;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by
     * notification channels to be included in the response.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string filter = 6;</code>
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by
     * notification channels to be included in the response.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string filter = 6;</code>
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by
     * notification channels to be included in the response.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string filter = 6;</code>
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by
     * notification channels to be included in the response.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string filter = 6;</code>
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If provided, this field specifies the criteria that must be met by
     * notification channels to be included in the response.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string filter = 6;</code>
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object orderBy_ = "";
    /**
     * <pre>
     * A comma-separated list of fields by which to sort the result. Supports
     * the same set of fields as in `filter`. Entries can be prefixed with
     * a minus sign to sort in descending rather than ascending order.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string order_by = 7;</code>
     */
    public java.lang.String getOrderBy() {
      java.lang.Object ref = orderBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A comma-separated list of fields by which to sort the result. Supports
     * the same set of fields as in `filter`. Entries can be prefixed with
     * a minus sign to sort in descending rather than ascending order.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string order_by = 7;</code>
     */
    public com.google.protobuf.ByteString
        getOrderByBytes() {
      java.lang.Object ref = orderBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A comma-separated list of fields by which to sort the result. Supports
     * the same set of fields as in `filter`. Entries can be prefixed with
     * a minus sign to sort in descending rather than ascending order.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string order_by = 7;</code>
     */
    public Builder setOrderBy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A comma-separated list of fields by which to sort the result. Supports
     * the same set of fields as in `filter`. Entries can be prefixed with
     * a minus sign to sort in descending rather than ascending order.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string order_by = 7;</code>
     */
    public Builder clearOrderBy() {
      
      orderBy_ = getDefaultInstance().getOrderBy();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A comma-separated list of fields by which to sort the result. Supports
     * the same set of fields as in `filter`. Entries can be prefixed with
     * a minus sign to sort in descending rather than ascending order.
     * For more details, see [sorting and
     * filtering](/monitoring/api/v3/sorting-and-filtering).
     * </pre>
     *
     * <code>string order_by = 7;</code>
     */
    public Builder setOrderByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderBy_ = value;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * The maximum number of results to return in a single response. If
     * not set to a positive number, a reasonable value will be chosen by the
     * service.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * The maximum number of results to return in a single response. If
     * not set to a positive number, a reasonable value will be chosen by the
     * service.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum number of results to return in a single response. If
     * not set to a positive number, a reasonable value will be chosen by the
     * service.
     * </pre>
     *
     * <code>int32 page_size = 3;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * If non-empty, `page_token` must contain a value returned as the
     * `next_page_token` in a previous response to request the next set
     * of results.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If non-empty, `page_token` must contain a value returned as the
     * `next_page_token` in a previous response to request the next set
     * of results.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If non-empty, `page_token` must contain a value returned as the
     * `next_page_token` in a previous response to request the next set
     * of results.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If non-empty, `page_token` must contain a value returned as the
     * `next_page_token` in a previous response to request the next set
     * of results.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If non-empty, `page_token` must contain a value returned as the
     * `next_page_token` in a previous response to request the next set
     * of results.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.ListNotificationChannelsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.ListNotificationChannelsRequest)
  private static final com.google.monitoring.v3.ListNotificationChannelsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.ListNotificationChannelsRequest();
  }

  public static com.google.monitoring.v3.ListNotificationChannelsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNotificationChannelsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListNotificationChannelsRequest>() {
    public ListNotificationChannelsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListNotificationChannelsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListNotificationChannelsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNotificationChannelsRequest> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.ListNotificationChannelsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
