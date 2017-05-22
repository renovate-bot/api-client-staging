// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1beta1/cloud_speech.proto

package com.google.cloud.speech.v1beta1;

/**
 * <pre>
 * Provides information to the recognizer that specifies how to process the
 * request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1beta1.StreamingRecognitionConfig}
 */
public  final class StreamingRecognitionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1beta1.StreamingRecognitionConfig)
    StreamingRecognitionConfigOrBuilder {
  // Use StreamingRecognitionConfig.newBuilder() to construct.
  private StreamingRecognitionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamingRecognitionConfig() {
    singleUtterance_ = false;
    interimResults_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StreamingRecognitionConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.cloud.speech.v1beta1.RecognitionConfig.Builder subBuilder = null;
            if (config_ != null) {
              subBuilder = config_.toBuilder();
            }
            config_ = input.readMessage(com.google.cloud.speech.v1beta1.RecognitionConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(config_);
              config_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            singleUtterance_ = input.readBool();
            break;
          }
          case 24: {

            interimResults_ = input.readBool();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1beta1.StreamingRecognitionConfig.class, com.google.cloud.speech.v1beta1.StreamingRecognitionConfig.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.speech.v1beta1.RecognitionConfig config_;
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
   */
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
   */
  public com.google.cloud.speech.v1beta1.RecognitionConfig getConfig() {
    return config_ == null ? com.google.cloud.speech.v1beta1.RecognitionConfig.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
   */
  public com.google.cloud.speech.v1beta1.RecognitionConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  public static final int SINGLE_UTTERANCE_FIELD_NUMBER = 2;
  private boolean singleUtterance_;
  /**
   * <pre>
   * *Optional* If `false` or omitted, the recognizer will perform continuous
   * recognition (continuing to wait for and process audio even if the user
   * pauses speaking) until the client closes the input stream (gRPC API) or
   * until the maximum time limit has been reached. May return multiple
   * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
   * If `true`, the recognizer will detect a single spoken utterance. When it
   * detects that the user has paused or stopped speaking, it will return an
   * `END_OF_UTTERANCE` event and cease recognition. It will return no more than
   * one `StreamingRecognitionResult` with the `is_final` flag set to `true`.
   * </pre>
   *
   * <code>optional bool single_utterance = 2;</code>
   */
  public boolean getSingleUtterance() {
    return singleUtterance_;
  }

  public static final int INTERIM_RESULTS_FIELD_NUMBER = 3;
  private boolean interimResults_;
  /**
   * <pre>
   * *Optional* If `true`, interim results (tentative hypotheses) may be
   * returned as they become available (these interim results are indicated with
   * the `is_final=false` flag).
   * If `false` or omitted, only `is_final=true` result(s) are returned.
   * </pre>
   *
   * <code>optional bool interim_results = 3;</code>
   */
  public boolean getInterimResults() {
    return interimResults_;
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
    if (config_ != null) {
      output.writeMessage(1, getConfig());
    }
    if (singleUtterance_ != false) {
      output.writeBool(2, singleUtterance_);
    }
    if (interimResults_ != false) {
      output.writeBool(3, interimResults_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConfig());
    }
    if (singleUtterance_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, singleUtterance_);
    }
    if (interimResults_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, interimResults_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v1beta1.StreamingRecognitionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1beta1.StreamingRecognitionConfig other = (com.google.cloud.speech.v1beta1.StreamingRecognitionConfig) obj;

    boolean result = true;
    result = result && (hasConfig() == other.hasConfig());
    if (hasConfig()) {
      result = result && getConfig()
          .equals(other.getConfig());
    }
    result = result && (getSingleUtterance()
        == other.getSingleUtterance());
    result = result && (getInterimResults()
        == other.getInterimResults());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (37 * hash) + SINGLE_UTTERANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSingleUtterance());
    hash = (37 * hash) + INTERIM_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getInterimResults());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.speech.v1beta1.StreamingRecognitionConfig prototype) {
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
   * Provides information to the recognizer that specifies how to process the
   * request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1beta1.StreamingRecognitionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1beta1.StreamingRecognitionConfig)
      com.google.cloud.speech.v1beta1.StreamingRecognitionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1beta1.StreamingRecognitionConfig.class, com.google.cloud.speech.v1beta1.StreamingRecognitionConfig.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1beta1.StreamingRecognitionConfig.newBuilder()
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
      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      singleUtterance_ = false;

      interimResults_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_StreamingRecognitionConfig_descriptor;
    }

    public com.google.cloud.speech.v1beta1.StreamingRecognitionConfig getDefaultInstanceForType() {
      return com.google.cloud.speech.v1beta1.StreamingRecognitionConfig.getDefaultInstance();
    }

    public com.google.cloud.speech.v1beta1.StreamingRecognitionConfig build() {
      com.google.cloud.speech.v1beta1.StreamingRecognitionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1beta1.StreamingRecognitionConfig buildPartial() {
      com.google.cloud.speech.v1beta1.StreamingRecognitionConfig result = new com.google.cloud.speech.v1beta1.StreamingRecognitionConfig(this);
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
      result.singleUtterance_ = singleUtterance_;
      result.interimResults_ = interimResults_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.speech.v1beta1.StreamingRecognitionConfig) {
        return mergeFrom((com.google.cloud.speech.v1beta1.StreamingRecognitionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1beta1.StreamingRecognitionConfig other) {
      if (other == com.google.cloud.speech.v1beta1.StreamingRecognitionConfig.getDefaultInstance()) return this;
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (other.getSingleUtterance() != false) {
        setSingleUtterance(other.getSingleUtterance());
      }
      if (other.getInterimResults() != false) {
        setInterimResults(other.getInterimResults());
      }
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
      com.google.cloud.speech.v1beta1.StreamingRecognitionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1beta1.StreamingRecognitionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.speech.v1beta1.RecognitionConfig config_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v1beta1.RecognitionConfig, com.google.cloud.speech.v1beta1.RecognitionConfig.Builder, com.google.cloud.speech.v1beta1.RecognitionConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    public com.google.cloud.speech.v1beta1.RecognitionConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? com.google.cloud.speech.v1beta1.RecognitionConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    public Builder setConfig(com.google.cloud.speech.v1beta1.RecognitionConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    public Builder setConfig(
        com.google.cloud.speech.v1beta1.RecognitionConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    public Builder mergeConfig(com.google.cloud.speech.v1beta1.RecognitionConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            com.google.cloud.speech.v1beta1.RecognitionConfig.newBuilder(config_).mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    public com.google.cloud.speech.v1beta1.RecognitionConfig.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    public com.google.cloud.speech.v1beta1.RecognitionConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            com.google.cloud.speech.v1beta1.RecognitionConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>optional .google.cloud.speech.v1beta1.RecognitionConfig config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.speech.v1beta1.RecognitionConfig, com.google.cloud.speech.v1beta1.RecognitionConfig.Builder, com.google.cloud.speech.v1beta1.RecognitionConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.speech.v1beta1.RecognitionConfig, com.google.cloud.speech.v1beta1.RecognitionConfig.Builder, com.google.cloud.speech.v1beta1.RecognitionConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private boolean singleUtterance_ ;
    /**
     * <pre>
     * *Optional* If `false` or omitted, the recognizer will perform continuous
     * recognition (continuing to wait for and process audio even if the user
     * pauses speaking) until the client closes the input stream (gRPC API) or
     * until the maximum time limit has been reached. May return multiple
     * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
     * If `true`, the recognizer will detect a single spoken utterance. When it
     * detects that the user has paused or stopped speaking, it will return an
     * `END_OF_UTTERANCE` event and cease recognition. It will return no more than
     * one `StreamingRecognitionResult` with the `is_final` flag set to `true`.
     * </pre>
     *
     * <code>optional bool single_utterance = 2;</code>
     */
    public boolean getSingleUtterance() {
      return singleUtterance_;
    }
    /**
     * <pre>
     * *Optional* If `false` or omitted, the recognizer will perform continuous
     * recognition (continuing to wait for and process audio even if the user
     * pauses speaking) until the client closes the input stream (gRPC API) or
     * until the maximum time limit has been reached. May return multiple
     * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
     * If `true`, the recognizer will detect a single spoken utterance. When it
     * detects that the user has paused or stopped speaking, it will return an
     * `END_OF_UTTERANCE` event and cease recognition. It will return no more than
     * one `StreamingRecognitionResult` with the `is_final` flag set to `true`.
     * </pre>
     *
     * <code>optional bool single_utterance = 2;</code>
     */
    public Builder setSingleUtterance(boolean value) {
      
      singleUtterance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Optional* If `false` or omitted, the recognizer will perform continuous
     * recognition (continuing to wait for and process audio even if the user
     * pauses speaking) until the client closes the input stream (gRPC API) or
     * until the maximum time limit has been reached. May return multiple
     * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
     * If `true`, the recognizer will detect a single spoken utterance. When it
     * detects that the user has paused or stopped speaking, it will return an
     * `END_OF_UTTERANCE` event and cease recognition. It will return no more than
     * one `StreamingRecognitionResult` with the `is_final` flag set to `true`.
     * </pre>
     *
     * <code>optional bool single_utterance = 2;</code>
     */
    public Builder clearSingleUtterance() {
      
      singleUtterance_ = false;
      onChanged();
      return this;
    }

    private boolean interimResults_ ;
    /**
     * <pre>
     * *Optional* If `true`, interim results (tentative hypotheses) may be
     * returned as they become available (these interim results are indicated with
     * the `is_final=false` flag).
     * If `false` or omitted, only `is_final=true` result(s) are returned.
     * </pre>
     *
     * <code>optional bool interim_results = 3;</code>
     */
    public boolean getInterimResults() {
      return interimResults_;
    }
    /**
     * <pre>
     * *Optional* If `true`, interim results (tentative hypotheses) may be
     * returned as they become available (these interim results are indicated with
     * the `is_final=false` flag).
     * If `false` or omitted, only `is_final=true` result(s) are returned.
     * </pre>
     *
     * <code>optional bool interim_results = 3;</code>
     */
    public Builder setInterimResults(boolean value) {
      
      interimResults_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Optional* If `true`, interim results (tentative hypotheses) may be
     * returned as they become available (these interim results are indicated with
     * the `is_final=false` flag).
     * If `false` or omitted, only `is_final=true` result(s) are returned.
     * </pre>
     *
     * <code>optional bool interim_results = 3;</code>
     */
    public Builder clearInterimResults() {
      
      interimResults_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1beta1.StreamingRecognitionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1beta1.StreamingRecognitionConfig)
  private static final com.google.cloud.speech.v1beta1.StreamingRecognitionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1beta1.StreamingRecognitionConfig();
  }

  public static com.google.cloud.speech.v1beta1.StreamingRecognitionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingRecognitionConfig>
      PARSER = new com.google.protobuf.AbstractParser<StreamingRecognitionConfig>() {
    public StreamingRecognitionConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StreamingRecognitionConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamingRecognitionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingRecognitionConfig> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.speech.v1beta1.StreamingRecognitionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

