// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/policy.proto

package com.google.iam.v1;

/**
 * <pre>
 * One delta entry for AuditConfig. Each individual change (only one
 * exempted_member in each entry) to a AuditConfig will be a separate entry.
 * </pre>
 *
 * Protobuf type {@code google.iam.v1.AuditConfigDelta}
 */
public  final class AuditConfigDelta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.iam.v1.AuditConfigDelta)
    AuditConfigDeltaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuditConfigDelta.newBuilder() to construct.
  private AuditConfigDelta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuditConfigDelta() {
    action_ = 0;
    service_ = "";
    exemptedMember_ = "";
    logType_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuditConfigDelta(
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
          case 8: {
            int rawValue = input.readEnum();

            action_ = rawValue;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            service_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            exemptedMember_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            logType_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PolicyProto.internal_static_google_iam_v1_AuditConfigDelta_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PolicyProto.internal_static_google_iam_v1_AuditConfigDelta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AuditConfigDelta.class, Builder.class);
  }

  /**
   * <pre>
   * The type of action performed on an audit configuration in a policy.
   * </pre>
   *
   * Protobuf enum {@code google.iam.v1.AuditConfigDelta.Action}
   */
  public enum Action
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>ACTION_UNSPECIFIED = 0;</code>
     */
    ACTION_UNSPECIFIED(0),
    /**
     * <pre>
     * Addition of an audit configuration.
     * </pre>
     *
     * <code>ADD = 1;</code>
     */
    ADD(1),
    /**
     * <pre>
     * Removal of an audit configuration.
     * </pre>
     *
     * <code>REMOVE = 2;</code>
     */
    REMOVE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>ACTION_UNSPECIFIED = 0;</code>
     */
    public static final int ACTION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Addition of an audit configuration.
     * </pre>
     *
     * <code>ADD = 1;</code>
     */
    public static final int ADD_VALUE = 1;
    /**
     * <pre>
     * Removal of an audit configuration.
     * </pre>
     *
     * <code>REMOVE = 2;</code>
     */
    public static final int REMOVE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static Action valueOf(int value) {
      return forNumber(value);
    }

    public static Action forNumber(int value) {
      switch (value) {
        case 0: return ACTION_UNSPECIFIED;
        case 1: return ADD;
        case 2: return REMOVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Action>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Action> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Action>() {
            public Action findValueByNumber(int number) {
              return Action.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return AuditConfigDelta.getDescriptor().getEnumTypes().get(0);
    }

    private static final Action[] VALUES = values();

    public static Action valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Action(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.iam.v1.AuditConfigDelta.Action)
  }

  public static final int ACTION_FIELD_NUMBER = 1;
  private int action_;
  /**
   * <pre>
   * The action that was performed on an audit configuration in a policy.
   * Required
   * </pre>
   *
   * <code>.google.iam.v1.AuditConfigDelta.Action action = 1;</code>
   */
  public int getActionValue() {
    return action_;
  }
  /**
   * <pre>
   * The action that was performed on an audit configuration in a policy.
   * Required
   * </pre>
   *
   * <code>.google.iam.v1.AuditConfigDelta.Action action = 1;</code>
   */
  public Action getAction() {
    @SuppressWarnings("deprecation")
    Action result = Action.valueOf(action_);
    return result == null ? Action.UNRECOGNIZED : result;
  }

  public static final int SERVICE_FIELD_NUMBER = 2;
  private volatile Object service_;
  /**
   * <pre>
   * Specifies a service that was configured for Cloud Audit Logging.
   * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
   * `allServices` is a special value that covers all services.
   * Required
   * </pre>
   *
   * <code>string service = 2;</code>
   */
  public String getService() {
    Object ref = service_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies a service that was configured for Cloud Audit Logging.
   * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
   * `allServices` is a special value that covers all services.
   * Required
   * </pre>
   *
   * <code>string service = 2;</code>
   */
  public com.google.protobuf.ByteString
      getServiceBytes() {
    Object ref = service_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXEMPTED_MEMBER_FIELD_NUMBER = 3;
  private volatile Object exemptedMember_;
  /**
   * <pre>
   * A single identity that is exempted from "data access" audit
   * logging for the `service` specified above.
   * Follows the same format of Binding.members.
   * </pre>
   *
   * <code>string exempted_member = 3;</code>
   */
  public String getExemptedMember() {
    Object ref = exemptedMember_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      exemptedMember_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A single identity that is exempted from "data access" audit
   * logging for the `service` specified above.
   * Follows the same format of Binding.members.
   * </pre>
   *
   * <code>string exempted_member = 3;</code>
   */
  public com.google.protobuf.ByteString
      getExemptedMemberBytes() {
    Object ref = exemptedMember_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      exemptedMember_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOG_TYPE_FIELD_NUMBER = 4;
  private volatile Object logType_;
  /**
   * <pre>
   * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
   * enabled, and cannot be configured.
   * Required
   * </pre>
   *
   * <code>string log_type = 4;</code>
   */
  public String getLogType() {
    Object ref = logType_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      logType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
   * enabled, and cannot be configured.
   * Required
   * </pre>
   *
   * <code>string log_type = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLogTypeBytes() {
    Object ref = logType_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      logType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (action_ != Action.ACTION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, action_);
    }
    if (!getServiceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, service_);
    }
    if (!getExemptedMemberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, exemptedMember_);
    }
    if (!getLogTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, logType_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (action_ != Action.ACTION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, action_);
    }
    if (!getServiceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, service_);
    }
    if (!getExemptedMemberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, exemptedMember_);
    }
    if (!getLogTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, logType_);
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
    if (!(obj instanceof AuditConfigDelta)) {
      return super.equals(obj);
    }
    AuditConfigDelta other = (AuditConfigDelta) obj;

    if (action_ != other.action_) return false;
    if (!getService()
        .equals(other.getService())) return false;
    if (!getExemptedMember()
        .equals(other.getExemptedMember())) return false;
    if (!getLogType()
        .equals(other.getLogType())) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + EXEMPTED_MEMBER_FIELD_NUMBER;
    hash = (53 * hash) + getExemptedMember().hashCode();
    hash = (37 * hash) + LOG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getLogType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AuditConfigDelta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuditConfigDelta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuditConfigDelta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuditConfigDelta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuditConfigDelta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuditConfigDelta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuditConfigDelta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AuditConfigDelta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AuditConfigDelta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AuditConfigDelta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AuditConfigDelta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AuditConfigDelta parseFrom(
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
  public static Builder newBuilder(AuditConfigDelta prototype) {
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
   * One delta entry for AuditConfig. Each individual change (only one
   * exempted_member in each entry) to a AuditConfig will be a separate entry.
   * </pre>
   *
   * Protobuf type {@code google.iam.v1.AuditConfigDelta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.iam.v1.AuditConfigDelta)
      com.google.iam.v1.AuditConfigDeltaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PolicyProto.internal_static_google_iam_v1_AuditConfigDelta_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PolicyProto.internal_static_google_iam_v1_AuditConfigDelta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AuditConfigDelta.class, Builder.class);
    }

    // Construct using com.google.iam.v1.AuditConfigDelta.newBuilder()
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
      action_ = 0;

      service_ = "";

      exemptedMember_ = "";

      logType_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PolicyProto.internal_static_google_iam_v1_AuditConfigDelta_descriptor;
    }

    @Override
    public AuditConfigDelta getDefaultInstanceForType() {
      return AuditConfigDelta.getDefaultInstance();
    }

    @Override
    public AuditConfigDelta build() {
      AuditConfigDelta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public AuditConfigDelta buildPartial() {
      AuditConfigDelta result = new AuditConfigDelta(this);
      result.action_ = action_;
      result.service_ = service_;
      result.exemptedMember_ = exemptedMember_;
      result.logType_ = logType_;
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
      if (other instanceof AuditConfigDelta) {
        return mergeFrom((AuditConfigDelta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AuditConfigDelta other) {
      if (other == AuditConfigDelta.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getExemptedMember().isEmpty()) {
        exemptedMember_ = other.exemptedMember_;
        onChanged();
      }
      if (!other.getLogType().isEmpty()) {
        logType_ = other.logType_;
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
      AuditConfigDelta parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AuditConfigDelta) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int action_ = 0;
    /**
     * <pre>
     * The action that was performed on an audit configuration in a policy.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.AuditConfigDelta.Action action = 1;</code>
     */
    public int getActionValue() {
      return action_;
    }
    /**
     * <pre>
     * The action that was performed on an audit configuration in a policy.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.AuditConfigDelta.Action action = 1;</code>
     */
    public Builder setActionValue(int value) {
      action_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action that was performed on an audit configuration in a policy.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.AuditConfigDelta.Action action = 1;</code>
     */
    public Action getAction() {
      @SuppressWarnings("deprecation")
      Action result = Action.valueOf(action_);
      return result == null ? Action.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The action that was performed on an audit configuration in a policy.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.AuditConfigDelta.Action action = 1;</code>
     */
    public Builder setAction(Action value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The action that was performed on an audit configuration in a policy.
     * Required
     * </pre>
     *
     * <code>.google.iam.v1.AuditConfigDelta.Action action = 1;</code>
     */
    public Builder clearAction() {
      
      action_ = 0;
      onChanged();
      return this;
    }

    private Object service_ = "";
    /**
     * <pre>
     * Specifies a service that was configured for Cloud Audit Logging.
     * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
     * `allServices` is a special value that covers all services.
     * Required
     * </pre>
     *
     * <code>string service = 2;</code>
     */
    public String getService() {
      Object ref = service_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Specifies a service that was configured for Cloud Audit Logging.
     * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
     * `allServices` is a special value that covers all services.
     * Required
     * </pre>
     *
     * <code>string service = 2;</code>
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies a service that was configured for Cloud Audit Logging.
     * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
     * `allServices` is a special value that covers all services.
     * Required
     * </pre>
     *
     * <code>string service = 2;</code>
     */
    public Builder setService(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      service_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a service that was configured for Cloud Audit Logging.
     * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
     * `allServices` is a special value that covers all services.
     * Required
     * </pre>
     *
     * <code>string service = 2;</code>
     */
    public Builder clearService() {
      
      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a service that was configured for Cloud Audit Logging.
     * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
     * `allServices` is a special value that covers all services.
     * Required
     * </pre>
     *
     * <code>string service = 2;</code>
     */
    public Builder setServiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      service_ = value;
      onChanged();
      return this;
    }

    private Object exemptedMember_ = "";
    /**
     * <pre>
     * A single identity that is exempted from "data access" audit
     * logging for the `service` specified above.
     * Follows the same format of Binding.members.
     * </pre>
     *
     * <code>string exempted_member = 3;</code>
     */
    public String getExemptedMember() {
      Object ref = exemptedMember_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        exemptedMember_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * A single identity that is exempted from "data access" audit
     * logging for the `service` specified above.
     * Follows the same format of Binding.members.
     * </pre>
     *
     * <code>string exempted_member = 3;</code>
     */
    public com.google.protobuf.ByteString
        getExemptedMemberBytes() {
      Object ref = exemptedMember_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        exemptedMember_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A single identity that is exempted from "data access" audit
     * logging for the `service` specified above.
     * Follows the same format of Binding.members.
     * </pre>
     *
     * <code>string exempted_member = 3;</code>
     */
    public Builder setExemptedMember(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      exemptedMember_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A single identity that is exempted from "data access" audit
     * logging for the `service` specified above.
     * Follows the same format of Binding.members.
     * </pre>
     *
     * <code>string exempted_member = 3;</code>
     */
    public Builder clearExemptedMember() {
      
      exemptedMember_ = getDefaultInstance().getExemptedMember();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A single identity that is exempted from "data access" audit
     * logging for the `service` specified above.
     * Follows the same format of Binding.members.
     * </pre>
     *
     * <code>string exempted_member = 3;</code>
     */
    public Builder setExemptedMemberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      exemptedMember_ = value;
      onChanged();
      return this;
    }

    private Object logType_ = "";
    /**
     * <pre>
     * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
     * enabled, and cannot be configured.
     * Required
     * </pre>
     *
     * <code>string log_type = 4;</code>
     */
    public String getLogType() {
      Object ref = logType_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        logType_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
     * enabled, and cannot be configured.
     * Required
     * </pre>
     *
     * <code>string log_type = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLogTypeBytes() {
      Object ref = logType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        logType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
     * enabled, and cannot be configured.
     * Required
     * </pre>
     *
     * <code>string log_type = 4;</code>
     */
    public Builder setLogType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      logType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
     * enabled, and cannot be configured.
     * Required
     * </pre>
     *
     * <code>string log_type = 4;</code>
     */
    public Builder clearLogType() {
      
      logType_ = getDefaultInstance().getLogType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the log_type that was be enabled. ADMIN_ACTIVITY is always
     * enabled, and cannot be configured.
     * Required
     * </pre>
     *
     * <code>string log_type = 4;</code>
     */
    public Builder setLogTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      logType_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.iam.v1.AuditConfigDelta)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v1.AuditConfigDelta)
  private static final AuditConfigDelta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AuditConfigDelta();
  }

  public static AuditConfigDelta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuditConfigDelta>
      PARSER = new com.google.protobuf.AbstractParser<AuditConfigDelta>() {
    @Override
    public AuditConfigDelta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuditConfigDelta(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuditConfigDelta> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AuditConfigDelta> getParserForType() {
    return PARSER;
  }

  @Override
  public AuditConfigDelta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

