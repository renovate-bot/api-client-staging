// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/operation.proto

package com.google.api.servicecontrol.v1;

public final class OperationProto {
  private OperationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/api/servicecontrol/v1/operation" +
      ".proto\022\034google.api.servicecontrol.v1\032\034go" +
      "ogle/api/annotations.proto\032,google/api/s" +
      "ervicecontrol/v1/log_entry.proto\032/google" +
      "/api/servicecontrol/v1/metric_value.prot" +
      "o\032\037google/protobuf/timestamp.proto\"\217\004\n\tO" +
      "peration\022\024\n\014operation_id\030\001 \001(\t\022\026\n\016operat" +
      "ion_name\030\002 \001(\t\022\023\n\013consumer_id\030\003 \001(\t\022.\n\ns" +
      "tart_time\030\004 \001(\0132\032.google.protobuf.Timest" +
      "amp\022,\n\010end_time\030\005 \001(\0132\032.google.protobuf.",
      "Timestamp\022C\n\006labels\030\006 \003(\01323.google.api.s" +
      "ervicecontrol.v1.Operation.LabelsEntry\022G" +
      "\n\021metric_value_sets\030\007 \003(\0132,.google.api.s" +
      "ervicecontrol.v1.MetricValueSet\022;\n\013log_e" +
      "ntries\030\010 \003(\0132&.google.api.servicecontrol" +
      ".v1.LogEntry\022F\n\nimportance\030\013 \001(\01622.googl" +
      "e.api.servicecontrol.v1.Operation.Import" +
      "ance\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"\037\n\nImportance\022\007\n\003LOW\020\000\022\010\n\004HI" +
      "GH\020\001B\203\001\n com.google.api.servicecontrol.v",
      "1B\016OperationProtoP\001ZJgoogle.golang.org/g" +
      "enproto/googleapis/api/servicecontrol/v1" +
      ";servicecontrol\370\001\001b\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.servicecontrol.v1.LogEntryProto.getDescriptor(),
          com.google.api.servicecontrol.v1.MetricValueSetProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_servicecontrol_v1_Operation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_servicecontrol_v1_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_Operation_descriptor,
        new java.lang.String[] { "OperationId", "OperationName", "ConsumerId", "StartTime", "EndTime", "Labels", "MetricValueSets", "LogEntries", "Importance", });
    internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_descriptor =
      internal_static_google_api_servicecontrol_v1_Operation_descriptor.getNestedTypes().get(0);
    internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_servicecontrol_v1_Operation_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.servicecontrol.v1.LogEntryProto.getDescriptor();
    com.google.api.servicecontrol.v1.MetricValueSetProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
