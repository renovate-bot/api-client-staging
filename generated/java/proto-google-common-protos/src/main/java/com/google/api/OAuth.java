// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/metadata.proto

package com.google.api;

/**
 * <pre>
 * Information about OAuth.
 * </pre>
 *
 * Protobuf type {@code google.api.OAuth}
 */
public  final class OAuth extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.OAuth)
    OAuthOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OAuth.newBuilder() to construct.
  private OAuth(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OAuth() {
    scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OAuth(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              scopes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            scopes_.add(s);
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
        scopes_ = scopes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.MetadataProto.internal_static_google_api_OAuth_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.MetadataProto.internal_static_google_api_OAuth_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.OAuth.class, com.google.api.OAuth.Builder.class);
  }

  public static final int SCOPES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList scopes_;
  /**
   * <pre>
   * The set of OAuth scopes needed to be able to successfully call any RPC
   * on the service. These are generally specified as a URL, for example:
   * "https://www.googleapis.com/auth/cloud-platform"
   * </pre>
   *
   * <code>repeated string scopes = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getScopesList() {
    return scopes_;
  }
  /**
   * <pre>
   * The set of OAuth scopes needed to be able to successfully call any RPC
   * on the service. These are generally specified as a URL, for example:
   * "https://www.googleapis.com/auth/cloud-platform"
   * </pre>
   *
   * <code>repeated string scopes = 1;</code>
   */
  public int getScopesCount() {
    return scopes_.size();
  }
  /**
   * <pre>
   * The set of OAuth scopes needed to be able to successfully call any RPC
   * on the service. These are generally specified as a URL, for example:
   * "https://www.googleapis.com/auth/cloud-platform"
   * </pre>
   *
   * <code>repeated string scopes = 1;</code>
   */
  public java.lang.String getScopes(int index) {
    return scopes_.get(index);
  }
  /**
   * <pre>
   * The set of OAuth scopes needed to be able to successfully call any RPC
   * on the service. These are generally specified as a URL, for example:
   * "https://www.googleapis.com/auth/cloud-platform"
   * </pre>
   *
   * <code>repeated string scopes = 1;</code>
   */
  public com.google.protobuf.ByteString
      getScopesBytes(int index) {
    return scopes_.getByteString(index);
  }

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
    for (int i = 0; i < scopes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scopes_.getRaw(i));
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
      for (int i = 0; i < scopes_.size(); i++) {
        dataSize += computeStringSizeNoTag(scopes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getScopesList().size();
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
    if (!(obj instanceof com.google.api.OAuth)) {
      return super.equals(obj);
    }
    com.google.api.OAuth other = (com.google.api.OAuth) obj;

    boolean result = true;
    result = result && getScopesList()
        .equals(other.getScopesList());
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
    if (getScopesCount() > 0) {
      hash = (37 * hash) + SCOPES_FIELD_NUMBER;
      hash = (53 * hash) + getScopesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.OAuth parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.OAuth parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.OAuth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.OAuth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.OAuth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.OAuth parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.OAuth parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.OAuth parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.OAuth parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.OAuth parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.OAuth parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.OAuth parseFrom(
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
  public static Builder newBuilder(com.google.api.OAuth prototype) {
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
   * Information about OAuth.
   * </pre>
   *
   * Protobuf type {@code google.api.OAuth}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.OAuth)
      com.google.api.OAuthOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.MetadataProto.internal_static_google_api_OAuth_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.MetadataProto.internal_static_google_api_OAuth_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.OAuth.class, com.google.api.OAuth.Builder.class);
    }

    // Construct using com.google.api.OAuth.newBuilder()
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
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.MetadataProto.internal_static_google_api_OAuth_descriptor;
    }

    @java.lang.Override
    public com.google.api.OAuth getDefaultInstanceForType() {
      return com.google.api.OAuth.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.OAuth build() {
      com.google.api.OAuth result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.OAuth buildPartial() {
      com.google.api.OAuth result = new com.google.api.OAuth(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        scopes_ = scopes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.scopes_ = scopes_;
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
      if (other instanceof com.google.api.OAuth) {
        return mergeFrom((com.google.api.OAuth)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.OAuth other) {
      if (other == com.google.api.OAuth.getDefaultInstance()) return this;
      if (!other.scopes_.isEmpty()) {
        if (scopes_.isEmpty()) {
          scopes_ = other.scopes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureScopesIsMutable();
          scopes_.addAll(other.scopes_);
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
      com.google.api.OAuth parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.OAuth) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureScopesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        scopes_ = new com.google.protobuf.LazyStringArrayList(scopes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getScopesList() {
      return scopes_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public int getScopesCount() {
      return scopes_.size();
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public java.lang.String getScopes(int index) {
      return scopes_.get(index);
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public com.google.protobuf.ByteString
        getScopesBytes(int index) {
      return scopes_.getByteString(index);
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public Builder setScopes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureScopesIsMutable();
      scopes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public Builder addScopes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public Builder addAllScopes(
        java.lang.Iterable<java.lang.String> values) {
      ensureScopesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scopes_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public Builder clearScopes() {
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of OAuth scopes needed to be able to successfully call any RPC
     * on the service. These are generally specified as a URL, for example:
     * "https://www.googleapis.com/auth/cloud-platform"
     * </pre>
     *
     * <code>repeated string scopes = 1;</code>
     */
    public Builder addScopesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureScopesIsMutable();
      scopes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.api.OAuth)
  }

  // @@protoc_insertion_point(class_scope:google.api.OAuth)
  private static final com.google.api.OAuth DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.OAuth();
  }

  public static com.google.api.OAuth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OAuth>
      PARSER = new com.google.protobuf.AbstractParser<OAuth>() {
    @java.lang.Override
    public OAuth parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OAuth(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OAuth> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OAuth> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.OAuth getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

