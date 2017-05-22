// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

package com.google.api;

/**
 * <pre>
 * User-defined authentication requirements, including support for
 * [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * </pre>
 *
 * Protobuf type {@code google.api.AuthRequirement}
 */
public  final class AuthRequirement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.AuthRequirement)
    AuthRequirementOrBuilder {
  // Use AuthRequirement.newBuilder() to construct.
  private AuthRequirement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthRequirement() {
    providerId_ = "";
    audiences_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AuthRequirement(
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
            java.lang.String s = input.readStringRequireUtf8();

            providerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            audiences_ = s;
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
    return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.AuthRequirement.class, com.google.api.AuthRequirement.Builder.class);
  }

  public static final int PROVIDER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object providerId_;
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>optional string provider_id = 1;</code>
   */
  public java.lang.String getProviderId() {
    java.lang.Object ref = providerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      providerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [id][google.api.AuthProvider.id] from authentication provider.
   * Example:
   *     provider_id: bookstore_auth
   * </pre>
   *
   * <code>optional string provider_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProviderIdBytes() {
    java.lang.Object ref = providerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      providerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIENCES_FIELD_NUMBER = 2;
  private volatile java.lang.Object audiences_;
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 2;</code>
   */
  public java.lang.String getAudiences() {
    java.lang.Object ref = audiences_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      audiences_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * NOTE: This will be deprecated soon, once AuthProvider.audiences is
   * implemented and accepted in all the runtime components.
   * The list of JWT
   * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
   * that are allowed to access. A JWT containing any of these audiences will
   * be accepted. When this setting is absent, only JWTs with audience
   * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
   * will be accepted. For example, if no audiences are in the setting,
   * LibraryService API will only accept JWTs with the following audience
   * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
   * Example:
   *     audiences: bookstore_android.apps.googleusercontent.com,
   *                bookstore_web.apps.googleusercontent.com
   * </pre>
   *
   * <code>optional string audiences = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAudiencesBytes() {
    java.lang.Object ref = audiences_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      audiences_ = b;
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
    if (!getProviderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, providerId_);
    }
    if (!getAudiencesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audiences_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProviderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, providerId_);
    }
    if (!getAudiencesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, audiences_);
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
    if (!(obj instanceof com.google.api.AuthRequirement)) {
      return super.equals(obj);
    }
    com.google.api.AuthRequirement other = (com.google.api.AuthRequirement) obj;

    boolean result = true;
    result = result && getProviderId()
        .equals(other.getProviderId());
    result = result && getAudiences()
        .equals(other.getAudiences());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + PROVIDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProviderId().hashCode();
    hash = (37 * hash) + AUDIENCES_FIELD_NUMBER;
    hash = (53 * hash) + getAudiences().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.AuthRequirement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.AuthRequirement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.AuthRequirement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.AuthRequirement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.AuthRequirement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.AuthRequirement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.AuthRequirement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.AuthRequirement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.AuthRequirement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.AuthRequirement parseFrom(
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
  public static Builder newBuilder(com.google.api.AuthRequirement prototype) {
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
   * User-defined authentication requirements, including support for
   * [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
   * </pre>
   *
   * Protobuf type {@code google.api.AuthRequirement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.AuthRequirement)
      com.google.api.AuthRequirementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.AuthRequirement.class, com.google.api.AuthRequirement.Builder.class);
    }

    // Construct using com.google.api.AuthRequirement.newBuilder()
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
      providerId_ = "";

      audiences_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.AuthProto.internal_static_google_api_AuthRequirement_descriptor;
    }

    public com.google.api.AuthRequirement getDefaultInstanceForType() {
      return com.google.api.AuthRequirement.getDefaultInstance();
    }

    public com.google.api.AuthRequirement build() {
      com.google.api.AuthRequirement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.AuthRequirement buildPartial() {
      com.google.api.AuthRequirement result = new com.google.api.AuthRequirement(this);
      result.providerId_ = providerId_;
      result.audiences_ = audiences_;
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
      if (other instanceof com.google.api.AuthRequirement) {
        return mergeFrom((com.google.api.AuthRequirement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.AuthRequirement other) {
      if (other == com.google.api.AuthRequirement.getDefaultInstance()) return this;
      if (!other.getProviderId().isEmpty()) {
        providerId_ = other.providerId_;
        onChanged();
      }
      if (!other.getAudiences().isEmpty()) {
        audiences_ = other.audiences_;
        onChanged();
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
      com.google.api.AuthRequirement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.AuthRequirement) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object providerId_ = "";
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public java.lang.String getProviderId() {
      java.lang.Object ref = providerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        providerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProviderIdBytes() {
      java.lang.Object ref = providerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        providerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public Builder setProviderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      providerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public Builder clearProviderId() {
      
      providerId_ = getDefaultInstance().getProviderId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [id][google.api.AuthProvider.id] from authentication provider.
     * Example:
     *     provider_id: bookstore_auth
     * </pre>
     *
     * <code>optional string provider_id = 1;</code>
     */
    public Builder setProviderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      providerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object audiences_ = "";
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public java.lang.String getAudiences() {
      java.lang.Object ref = audiences_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        audiences_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAudiencesBytes() {
      java.lang.Object ref = audiences_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        audiences_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public Builder setAudiences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      audiences_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public Builder clearAudiences() {
      
      audiences_ = getDefaultInstance().getAudiences();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is
     * implemented and accepted in all the runtime components.
     * The list of JWT
     * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
     * that are allowed to access. A JWT containing any of these audiences will
     * be accepted. When this setting is absent, only JWTs with audience
     * "https://[Service_name][google.api.Service.name]/[API_name][google.protobuf.Api.name]"
     * will be accepted. For example, if no audiences are in the setting,
     * LibraryService API will only accept JWTs with the following audience
     * "https://library-example.googleapis.com/google.example.library.v1.LibraryService".
     * Example:
     *     audiences: bookstore_android.apps.googleusercontent.com,
     *                bookstore_web.apps.googleusercontent.com
     * </pre>
     *
     * <code>optional string audiences = 2;</code>
     */
    public Builder setAudiencesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      audiences_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.api.AuthRequirement)
  }

  // @@protoc_insertion_point(class_scope:google.api.AuthRequirement)
  private static final com.google.api.AuthRequirement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.AuthRequirement();
  }

  public static com.google.api.AuthRequirement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthRequirement>
      PARSER = new com.google.protobuf.AbstractParser<AuthRequirement>() {
    public AuthRequirement parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthRequirement(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthRequirement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthRequirement> getParserForType() {
    return PARSER;
  }

  public com.google.api.AuthRequirement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

