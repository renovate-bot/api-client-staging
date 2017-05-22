// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

public interface LocalizedMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.LocalizedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The locale used following the specification defined at
   * http://www.rfc-editor.org/rfc/bcp/bcp47.txt.
   * Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>optional string locale = 1;</code>
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * The locale used following the specification defined at
   * http://www.rfc-editor.org/rfc/bcp/bcp47.txt.
   * Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>optional string locale = 1;</code>
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>optional string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
