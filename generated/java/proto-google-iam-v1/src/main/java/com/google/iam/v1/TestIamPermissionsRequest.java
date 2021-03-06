// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/iam_policy.proto

package com.google.iam.v1;

/**
 * <pre>
 * Request message for `TestIamPermissions` method.
 * </pre>
 *
 * Protobuf type {@code google.iam.v1.TestIamPermissionsRequest}
 */
public  final class TestIamPermissionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.v1.TestIamPermissionsRequest)
    TestIamPermissionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestIamPermissionsRequest.newBuilder() to construct.
  private TestIamPermissionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestIamPermissionsRequest() {
    resource_ = "";
    permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TestIamPermissionsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            resource_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              permissions_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            permissions_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        permissions_ = permissions_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return IamPolicyProto.internal_static_google_iam_v1_TestIamPermissionsRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return IamPolicyProto.internal_static_google_iam_v1_TestIamPermissionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TestIamPermissionsRequest.class, Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_FIELD_NUMBER = 1;
  private volatile Object resource_;
  /**
   * <pre>
   * REQUIRED: The resource for which the policy detail is being requested.
   * See the operation documentation for the appropriate value for this field.
   * </pre>
   *
   * <code>string resource = 1;</code>
   */
  public String getResource() {
    Object ref = resource_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * REQUIRED: The resource for which the policy detail is being requested.
   * See the operation documentation for the appropriate value for this field.
   * </pre>
   *
   * <code>string resource = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceBytes() {
    Object ref = resource_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSIONS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList permissions_;
  /**
   * <pre>
   * The set of permissions to check for the `resource`. Permissions with
   * wildcards (such as '*' or 'storage.*') are not allowed. For more
   * information see
   * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * </pre>
   *
   * <code>repeated string permissions = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPermissionsList() {
    return permissions_;
  }
  /**
   * <pre>
   * The set of permissions to check for the `resource`. Permissions with
   * wildcards (such as '*' or 'storage.*') are not allowed. For more
   * information see
   * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * </pre>
   *
   * <code>repeated string permissions = 2;</code>
   */
  public int getPermissionsCount() {
    return permissions_.size();
  }
  /**
   * <pre>
   * The set of permissions to check for the `resource`. Permissions with
   * wildcards (such as '*' or 'storage.*') are not allowed. For more
   * information see
   * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * </pre>
   *
   * <code>repeated string permissions = 2;</code>
   */
  public String getPermissions(int index) {
    return permissions_.get(index);
  }
  /**
   * <pre>
   * The set of permissions to check for the `resource`. Permissions with
   * wildcards (such as '*' or 'storage.*') are not allowed. For more
   * information see
   * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * </pre>
   *
   * <code>repeated string permissions = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPermissionsBytes(int index) {
    return permissions_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resource_);
    }
    for (int i = 0; i < permissions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, permissions_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resource_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < permissions_.size(); i++) {
        dataSize += computeStringSizeNoTag(permissions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPermissionsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof TestIamPermissionsRequest)) {
      return super.equals(obj);
    }
    TestIamPermissionsRequest other = (TestIamPermissionsRequest) obj;

    if (!getResource()
        .equals(other.getResource())) return false;
    if (!getPermissionsList()
        .equals(other.getPermissionsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    if (getPermissionsCount() > 0) {
      hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPermissionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TestIamPermissionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TestIamPermissionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TestIamPermissionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TestIamPermissionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TestIamPermissionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TestIamPermissionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TestIamPermissionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TestIamPermissionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static TestIamPermissionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static TestIamPermissionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TestIamPermissionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TestIamPermissionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(TestIamPermissionsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for `TestIamPermissions` method.
   * </pre>
   *
   * Protobuf type {@code google.iam.v1.TestIamPermissionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.v1.TestIamPermissionsRequest)
      com.google.iam.v1.TestIamPermissionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return IamPolicyProto.internal_static_google_iam_v1_TestIamPermissionsRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return IamPolicyProto.internal_static_google_iam_v1_TestIamPermissionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TestIamPermissionsRequest.class, Builder.class);
    }

    // Construct using com.google.iam.v1.TestIamPermissionsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      resource_ = "";

      permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return IamPolicyProto.internal_static_google_iam_v1_TestIamPermissionsRequest_descriptor;
    }

    @Override
    public TestIamPermissionsRequest getDefaultInstanceForType() {
      return TestIamPermissionsRequest.getDefaultInstance();
    }

    @Override
    public TestIamPermissionsRequest build() {
      TestIamPermissionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public TestIamPermissionsRequest buildPartial() {
      TestIamPermissionsRequest result = new TestIamPermissionsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.resource_ = resource_;
      if (((bitField0_ & 0x00000002) != 0)) {
        permissions_ = permissions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.permissions_ = permissions_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof TestIamPermissionsRequest) {
        return mergeFrom((TestIamPermissionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TestIamPermissionsRequest other) {
      if (other == TestIamPermissionsRequest.getDefaultInstance()) return this;
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        onChanged();
      }
      if (!other.permissions_.isEmpty()) {
        if (permissions_.isEmpty()) {
          permissions_ = other.permissions_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensurePermissionsIsMutable();
          permissions_.addAll(other.permissions_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      TestIamPermissionsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (TestIamPermissionsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object resource_ = "";
    /**
     * <pre>
     * REQUIRED: The resource for which the policy detail is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public String getResource() {
      Object ref = resource_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * REQUIRED: The resource for which the policy detail is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * REQUIRED: The resource for which the policy detail is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public Builder setResource(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: The resource for which the policy detail is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public Builder clearResource() {
      
      resource_ = getDefaultInstance().getResource();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: The resource for which the policy detail is being requested.
     * See the operation documentation for the appropriate value for this field.
     * </pre>
     *
     * <code>string resource = 1;</code>
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resource_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePermissionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        permissions_ = new com.google.protobuf.LazyStringArrayList(permissions_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPermissionsList() {
      return permissions_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public int getPermissionsCount() {
      return permissions_.size();
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public String getPermissions(int index) {
      return permissions_.get(index);
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPermissionsBytes(int index) {
      return permissions_.getByteString(index);
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public Builder setPermissions(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePermissionsIsMutable();
      permissions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public Builder addPermissions(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePermissionsIsMutable();
      permissions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public Builder addAllPermissions(
        Iterable<String> values) {
      ensurePermissionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, permissions_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public Builder clearPermissions() {
      permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The set of permissions to check for the `resource`. Permissions with
     * wildcards (such as '*' or 'storage.*') are not allowed. For more
     * information see
     * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
     * </pre>
     *
     * <code>repeated string permissions = 2;</code>
     */
    public Builder addPermissionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePermissionsIsMutable();
      permissions_.add(value);
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.iam.v1.TestIamPermissionsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v1.TestIamPermissionsRequest)
  private static final TestIamPermissionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TestIamPermissionsRequest();
  }

  public static TestIamPermissionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestIamPermissionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<TestIamPermissionsRequest>() {
    @Override
    public TestIamPermissionsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TestIamPermissionsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TestIamPermissionsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<TestIamPermissionsRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public TestIamPermissionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

