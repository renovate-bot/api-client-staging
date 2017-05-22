// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface AnalyzeEntitySentimentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1beta2.Document document = 1;</code>
   */
  boolean hasDocument();
  /**
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1beta2.Document document = 1;</code>
   */
  com.google.cloud.language.v1beta2.Document getDocument();
  /**
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1beta2.Document document = 1;</code>
   */
  com.google.cloud.language.v1beta2.DocumentOrBuilder getDocumentOrBuilder();

  /**
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
   */
  int getEncodingTypeValue();
  /**
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>optional .google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
   */
  com.google.cloud.language.v1beta2.EncodingType getEncodingType();
}
