// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/resources.proto

package com.google.api;

public interface ResourceSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ResourceSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The colloquial name of the resource.
   * If omitted, this is the name of the message.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The colloquial name of the resource.
   * If omitted, this is the name of the message.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Component resources that are part of the set.
   * Resources declared within a resource set must have `name` set.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  java.util.List<com.google.api.Resource> 
      getResourcesList();
  /**
   * <pre>
   * Component resources that are part of the set.
   * Resources declared within a resource set must have `name` set.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  com.google.api.Resource getResources(int index);
  /**
   * <pre>
   * Component resources that are part of the set.
   * Resources declared within a resource set must have `name` set.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  int getResourcesCount();
  /**
   * <pre>
   * Component resources that are part of the set.
   * Resources declared within a resource set must have `name` set.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  java.util.List<? extends com.google.api.ResourceOrBuilder> 
      getResourcesOrBuilderList();
  /**
   * <pre>
   * Component resources that are part of the set.
   * Resources declared within a resource set must have `name` set.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated .google.api.Resource resources = 2;</code>
   */
  com.google.api.ResourceOrBuilder getResourcesOrBuilder(
      int index);

  /**
   * <pre>
   * References to existing resources (messages of resource definitions)
   * that are part of the set.
   * These may be specified as fully-qualified (e.g. "google.pubsub.v1.Topic")
   * or just the resource/proto name if it is defined within the same package.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated string resource_references = 3;</code>
   */
  java.util.List<java.lang.String>
      getResourceReferencesList();
  /**
   * <pre>
   * References to existing resources (messages of resource definitions)
   * that are part of the set.
   * These may be specified as fully-qualified (e.g. "google.pubsub.v1.Topic")
   * or just the resource/proto name if it is defined within the same package.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated string resource_references = 3;</code>
   */
  int getResourceReferencesCount();
  /**
   * <pre>
   * References to existing resources (messages of resource definitions)
   * that are part of the set.
   * These may be specified as fully-qualified (e.g. "google.pubsub.v1.Topic")
   * or just the resource/proto name if it is defined within the same package.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated string resource_references = 3;</code>
   */
  java.lang.String getResourceReferences(int index);
  /**
   * <pre>
   * References to existing resources (messages of resource definitions)
   * that are part of the set.
   * These may be specified as fully-qualified (e.g. "google.pubsub.v1.Topic")
   * or just the resource/proto name if it is defined within the same package.
   * The final set of resources in the resource set is the union of
   * `resources` and `resource_references`.
   * </pre>
   *
   * <code>repeated string resource_references = 3;</code>
   */
  com.google.protobuf.ByteString
      getResourceReferencesBytes(int index);
}