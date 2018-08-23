// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/retry.proto

package com.google.api;

/**
 * <pre>
 * Information about situations where retrying a request should be
 * handled automatically.
 * </pre>
 *
 * Protobuf type {@code google.api.Retry}
 */
public  final class Retry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.Retry)
    RetryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Retry.newBuilder() to construct.
  private Retry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Retry() {
    codes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Retry(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              codes_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            codes_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                codes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              codes_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        codes_ = java.util.Collections.unmodifiableList(codes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.RetryProto.internal_static_google_api_Retry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.RetryProto.internal_static_google_api_Retry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.Retry.class, com.google.api.Retry.Builder.class);
  }

  public static final int CODES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> codes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.rpc.Code> codes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.rpc.Code>() {
            public com.google.rpc.Code convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.google.rpc.Code result = com.google.rpc.Code.valueOf(from);
              return result == null ? com.google.rpc.Code.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Designate that the given gRPC error codes should be automatically
   * retried by clients.
   * `INTERNAL` and `UNAVAILABLE` are retried on requests known
   * to be idempotent (annotated with google.api.http with a `get` key).
   * </pre>
   *
   * <code>repeated .google.rpc.Code codes = 1;</code>
   */
  public java.util.List<com.google.rpc.Code> getCodesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.rpc.Code>(codes_, codes_converter_);
  }
  /**
   * <pre>
   * Designate that the given gRPC error codes should be automatically
   * retried by clients.
   * `INTERNAL` and `UNAVAILABLE` are retried on requests known
   * to be idempotent (annotated with google.api.http with a `get` key).
   * </pre>
   *
   * <code>repeated .google.rpc.Code codes = 1;</code>
   */
  public int getCodesCount() {
    return codes_.size();
  }
  /**
   * <pre>
   * Designate that the given gRPC error codes should be automatically
   * retried by clients.
   * `INTERNAL` and `UNAVAILABLE` are retried on requests known
   * to be idempotent (annotated with google.api.http with a `get` key).
   * </pre>
   *
   * <code>repeated .google.rpc.Code codes = 1;</code>
   */
  public com.google.rpc.Code getCodes(int index) {
    return codes_converter_.convert(codes_.get(index));
  }
  /**
   * <pre>
   * Designate that the given gRPC error codes should be automatically
   * retried by clients.
   * `INTERNAL` and `UNAVAILABLE` are retried on requests known
   * to be idempotent (annotated with google.api.http with a `get` key).
   * </pre>
   *
   * <code>repeated .google.rpc.Code codes = 1;</code>
   */
  public java.util.List<java.lang.Integer>
  getCodesValueList() {
    return codes_;
  }
  /**
   * <pre>
   * Designate that the given gRPC error codes should be automatically
   * retried by clients.
   * `INTERNAL` and `UNAVAILABLE` are retried on requests known
   * to be idempotent (annotated with google.api.http with a `get` key).
   * </pre>
   *
   * <code>repeated .google.rpc.Code codes = 1;</code>
   */
  public int getCodesValue(int index) {
    return codes_.get(index);
  }
  private int codesMemoizedSerializedSize;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getCodesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(codesMemoizedSerializedSize);
    }
    for (int i = 0; i < codes_.size(); i++) {
      output.writeEnumNoTag(codes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < codes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(codes_.get(i));
      }
      size += dataSize;
      if (!getCodesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }codesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.api.Retry)) {
      return super.equals(obj);
    }
    com.google.api.Retry other = (com.google.api.Retry) obj;

    boolean result = true;
    result = result && codes_.equals(other.codes_);
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
    if (getCodesCount() > 0) {
      hash = (37 * hash) + CODES_FIELD_NUMBER;
      hash = (53 * hash) + codes_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.Retry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Retry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Retry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Retry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Retry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.Retry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.Retry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Retry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Retry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.Retry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.Retry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.Retry parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.Retry prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Information about situations where retrying a request should be
   * handled automatically.
   * </pre>
   *
   * Protobuf type {@code google.api.Retry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Retry)
      com.google.api.RetryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.RetryProto.internal_static_google_api_Retry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.RetryProto.internal_static_google_api_Retry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.Retry.class, com.google.api.Retry.Builder.class);
    }

    // Construct using com.google.api.Retry.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      codes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.RetryProto.internal_static_google_api_Retry_descriptor;
    }

    @java.lang.Override
    public com.google.api.Retry getDefaultInstanceForType() {
      return com.google.api.Retry.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.Retry build() {
      com.google.api.Retry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.Retry buildPartial() {
      com.google.api.Retry result = new com.google.api.Retry(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        codes_ = java.util.Collections.unmodifiableList(codes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.codes_ = codes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.Retry) {
        return mergeFrom((com.google.api.Retry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.Retry other) {
      if (other == com.google.api.Retry.getDefaultInstance()) return this;
      if (!other.codes_.isEmpty()) {
        if (codes_.isEmpty()) {
          codes_ = other.codes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCodesIsMutable();
          codes_.addAll(other.codes_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.api.Retry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.Retry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> codes_ =
      java.util.Collections.emptyList();
    private void ensureCodesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        codes_ = new java.util.ArrayList<java.lang.Integer>(codes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public java.util.List<com.google.rpc.Code> getCodesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.rpc.Code>(codes_, codes_converter_);
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public int getCodesCount() {
      return codes_.size();
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public com.google.rpc.Code getCodes(int index) {
      return codes_converter_.convert(codes_.get(index));
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public Builder setCodes(
        int index, com.google.rpc.Code value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCodesIsMutable();
      codes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public Builder addCodes(com.google.rpc.Code value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCodesIsMutable();
      codes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public Builder addAllCodes(
        java.lang.Iterable<? extends com.google.rpc.Code> values) {
      ensureCodesIsMutable();
      for (com.google.rpc.Code value : values) {
        codes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public Builder clearCodes() {
      codes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public java.util.List<java.lang.Integer>
    getCodesValueList() {
      return java.util.Collections.unmodifiableList(codes_);
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public int getCodesValue(int index) {
      return codes_.get(index);
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public Builder setCodesValue(
        int index, int value) {
      ensureCodesIsMutable();
      codes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public Builder addCodesValue(int value) {
      ensureCodesIsMutable();
      codes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Designate that the given gRPC error codes should be automatically
     * retried by clients.
     * `INTERNAL` and `UNAVAILABLE` are retried on requests known
     * to be idempotent (annotated with google.api.http with a `get` key).
     * </pre>
     *
     * <code>repeated .google.rpc.Code codes = 1;</code>
     */
    public Builder addAllCodesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureCodesIsMutable();
      for (int value : values) {
        codes_.add(value);
      }
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.api.Retry)
  }

  // @@protoc_insertion_point(class_scope:google.api.Retry)
  private static final com.google.api.Retry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.Retry();
  }

  public static com.google.api.Retry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Retry>
      PARSER = new com.google.protobuf.AbstractParser<Retry>() {
    @java.lang.Override
    public Retry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Retry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Retry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Retry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.Retry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

