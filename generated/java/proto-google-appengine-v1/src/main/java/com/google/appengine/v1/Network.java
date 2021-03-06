// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Extra network settings. Only applicable for VM runtimes.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.Network}
 */
public  final class Network extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.Network)
    NetworkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Network.newBuilder() to construct.
  private Network(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Network() {
    forwardedPorts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    instanceTag_ = "";
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Network(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              forwardedPorts_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            forwardedPorts_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            instanceTag_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
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
        forwardedPorts_ = forwardedPorts_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Network_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Network_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.Network.class, com.google.appengine.v1.Network.Builder.class);
  }

  private int bitField0_;
  public static final int FORWARDED_PORTS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList forwardedPorts_;
  /**
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getForwardedPortsList() {
    return forwardedPorts_;
  }
  /**
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   */
  public int getForwardedPortsCount() {
    return forwardedPorts_.size();
  }
  /**
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   */
  public java.lang.String getForwardedPorts(int index) {
    return forwardedPorts_.get(index);
  }
  /**
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   */
  public com.google.protobuf.ByteString
      getForwardedPortsBytes(int index) {
    return forwardedPorts_.getByteString(index);
  }

  public static final int INSTANCE_TAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object instanceTag_;
  /**
   * <pre>
   * Tag to apply to the VM instance during creation.
   * </pre>
   *
   * <code>string instance_tag = 2;</code>
   */
  public java.lang.String getInstanceTag() {
    java.lang.Object ref = instanceTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceTag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Tag to apply to the VM instance during creation.
   * </pre>
   *
   * <code>string instance_tag = 2;</code>
   */
  public com.google.protobuf.ByteString
      getInstanceTagBytes() {
    java.lang.Object ref = instanceTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Google Cloud Platform network where the virtual machines are created.
   * Specify the short name, not the resource path.
   * Defaults to `default`.
   * </pre>
   *
   * <code>string name = 3;</code>
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
   * Google Cloud Platform network where the virtual machines are created.
   * Specify the short name, not the resource path.
   * Defaults to `default`.
   * </pre>
   *
   * <code>string name = 3;</code>
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
    for (int i = 0; i < forwardedPorts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, forwardedPorts_.getRaw(i));
    }
    if (!getInstanceTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instanceTag_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < forwardedPorts_.size(); i++) {
        dataSize += computeStringSizeNoTag(forwardedPorts_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getForwardedPortsList().size();
    }
    if (!getInstanceTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instanceTag_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
    if (!(obj instanceof com.google.appengine.v1.Network)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.Network other = (com.google.appengine.v1.Network) obj;

    boolean result = true;
    result = result && getForwardedPortsList()
        .equals(other.getForwardedPortsList());
    result = result && getInstanceTag()
        .equals(other.getInstanceTag());
    result = result && getName()
        .equals(other.getName());
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
    if (getForwardedPortsCount() > 0) {
      hash = (37 * hash) + FORWARDED_PORTS_FIELD_NUMBER;
      hash = (53 * hash) + getForwardedPortsList().hashCode();
    }
    hash = (37 * hash) + INSTANCE_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceTag().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.Network parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Network parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Network parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Network parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Network parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.Network parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.Network parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Network parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.Network parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Network parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.Network parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.Network parseFrom(
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
  public static Builder newBuilder(com.google.appengine.v1.Network prototype) {
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
   * Extra network settings. Only applicable for VM runtimes.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.Network}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.Network)
      com.google.appengine.v1.NetworkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Network_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Network_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.Network.class, com.google.appengine.v1.Network.Builder.class);
    }

    // Construct using com.google.appengine.v1.Network.newBuilder()
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
      forwardedPorts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      instanceTag_ = "";

      name_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.VersionProto.internal_static_google_appengine_v1_Network_descriptor;
    }

    public com.google.appengine.v1.Network getDefaultInstanceForType() {
      return com.google.appengine.v1.Network.getDefaultInstance();
    }

    public com.google.appengine.v1.Network build() {
      com.google.appengine.v1.Network result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.Network buildPartial() {
      com.google.appengine.v1.Network result = new com.google.appengine.v1.Network(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        forwardedPorts_ = forwardedPorts_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.forwardedPorts_ = forwardedPorts_;
      result.instanceTag_ = instanceTag_;
      result.name_ = name_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.appengine.v1.Network) {
        return mergeFrom((com.google.appengine.v1.Network)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.Network other) {
      if (other == com.google.appengine.v1.Network.getDefaultInstance()) return this;
      if (!other.forwardedPorts_.isEmpty()) {
        if (forwardedPorts_.isEmpty()) {
          forwardedPorts_ = other.forwardedPorts_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureForwardedPortsIsMutable();
          forwardedPorts_.addAll(other.forwardedPorts_);
        }
        onChanged();
      }
      if (!other.getInstanceTag().isEmpty()) {
        instanceTag_ = other.instanceTag_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
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
      com.google.appengine.v1.Network parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.Network) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList forwardedPorts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureForwardedPortsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        forwardedPorts_ = new com.google.protobuf.LazyStringArrayList(forwardedPorts_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getForwardedPortsList() {
      return forwardedPorts_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public int getForwardedPortsCount() {
      return forwardedPorts_.size();
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public java.lang.String getForwardedPorts(int index) {
      return forwardedPorts_.get(index);
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public com.google.protobuf.ByteString
        getForwardedPortsBytes(int index) {
      return forwardedPorts_.getByteString(index);
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public Builder setForwardedPorts(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureForwardedPortsIsMutable();
      forwardedPorts_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public Builder addForwardedPorts(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureForwardedPortsIsMutable();
      forwardedPorts_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public Builder addAllForwardedPorts(
        java.lang.Iterable<java.lang.String> values) {
      ensureForwardedPortsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, forwardedPorts_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public Builder clearForwardedPorts() {
      forwardedPorts_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of ports, or port pairs, to forward from the virtual machine to the
     * application container.
     * </pre>
     *
     * <code>repeated string forwarded_ports = 1;</code>
     */
    public Builder addForwardedPortsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureForwardedPortsIsMutable();
      forwardedPorts_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object instanceTag_ = "";
    /**
     * <pre>
     * Tag to apply to the VM instance during creation.
     * </pre>
     *
     * <code>string instance_tag = 2;</code>
     */
    public java.lang.String getInstanceTag() {
      java.lang.Object ref = instanceTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Tag to apply to the VM instance during creation.
     * </pre>
     *
     * <code>string instance_tag = 2;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceTagBytes() {
      java.lang.Object ref = instanceTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Tag to apply to the VM instance during creation.
     * </pre>
     *
     * <code>string instance_tag = 2;</code>
     */
    public Builder setInstanceTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tag to apply to the VM instance during creation.
     * </pre>
     *
     * <code>string instance_tag = 2;</code>
     */
    public Builder clearInstanceTag() {
      
      instanceTag_ = getDefaultInstance().getInstanceTag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tag to apply to the VM instance during creation.
     * </pre>
     *
     * <code>string instance_tag = 2;</code>
     */
    public Builder setInstanceTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceTag_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Google Cloud Platform network where the virtual machines are created.
     * Specify the short name, not the resource path.
     * Defaults to `default`.
     * </pre>
     *
     * <code>string name = 3;</code>
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
     * Google Cloud Platform network where the virtual machines are created.
     * Specify the short name, not the resource path.
     * Defaults to `default`.
     * </pre>
     *
     * <code>string name = 3;</code>
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
     * Google Cloud Platform network where the virtual machines are created.
     * Specify the short name, not the resource path.
     * Defaults to `default`.
     * </pre>
     *
     * <code>string name = 3;</code>
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
     * Google Cloud Platform network where the virtual machines are created.
     * Specify the short name, not the resource path.
     * Defaults to `default`.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Google Cloud Platform network where the virtual machines are created.
     * Specify the short name, not the resource path.
     * Defaults to `default`.
     * </pre>
     *
     * <code>string name = 3;</code>
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.Network)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.Network)
  private static final com.google.appengine.v1.Network DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.Network();
  }

  public static com.google.appengine.v1.Network getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Network>
      PARSER = new com.google.protobuf.AbstractParser<Network>() {
    public Network parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Network(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Network> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Network> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.Network getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

