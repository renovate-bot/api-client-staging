// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/source_info.proto

package com.google.api;

public final class SourceInfoProto {
  private SourceInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_SourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_SourceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034google/api/source_info.proto\022\ngoogle.a" +
      "pi\032\031google/protobuf/any.proto\"8\n\nSourceI" +
      "nfo\022*\n\014source_files\030\001 \003(\0132\024.google.proto" +
      "buf.AnyBq\n\016com.google.apiB\017SourceInfoPro" +
      "toP\001ZEgoogle.golang.org/genproto/googlea" +
      "pis/api/serviceconfig;serviceconfig\242\002\004GA" +
      "PIb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_SourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_SourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_SourceInfo_descriptor,
        new java.lang.String[] { "SourceFiles", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
