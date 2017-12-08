// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/context.proto

package com.google.cloud.dialogflow.v2beta1;

public final class ContextProto {
  private ContextProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_Context_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/contex" +
      "t.proto\022\037google.cloud.dialogflow.v2beta1" +
      "\032\034google/api/annotations.proto\032\033google/p" +
      "rotobuf/empty.proto\032 google/protobuf/fie" +
      "ld_mask.proto\032\034google/protobuf/struct.pr" +
      "oto\"\\\n\007Context\022\014\n\004name\030\001 \001(\t\022\026\n\016lifespan" +
      "_count\030\002 \001(\005\022+\n\nparameters\030\003 \001(\0132\027.googl" +
      "e.protobuf.Struct\"L\n\023ListContextsRequest" +
      "\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\np" +
      "age_token\030\003 \001(\t\"k\n\024ListContextsResponse\022",
      ":\n\010contexts\030\001 \003(\0132(.google.cloud.dialogf" +
      "low.v2beta1.Context\022\027\n\017next_page_token\030\002" +
      " \001(\t\"!\n\021GetContextRequest\022\014\n\004name\030\001 \001(\t\"" +
      "a\n\024CreateContextRequest\022\016\n\006parent\030\001 \001(\t\022" +
      "9\n\007context\030\002 \001(\0132(.google.cloud.dialogfl" +
      "ow.v2beta1.Context\"\202\001\n\024UpdateContextRequ" +
      "est\0229\n\007context\030\001 \001(\0132(.google.cloud.dial" +
      "ogflow.v2beta1.Context\022/\n\013update_mask\030\002 " +
      "\001(\0132\032.google.protobuf.FieldMask\"$\n\024Delet" +
      "eContextRequest\022\014\n\004name\030\001 \001(\t\"*\n\030DeleteA",
      "llContextsRequest\022\016\n\006parent\030\001 \001(\t2\277\010\n\010Co" +
      "ntexts\022\273\001\n\014ListContexts\0224.google.cloud.d" +
      "ialogflow.v2beta1.ListContextsRequest\0325." +
      "google.cloud.dialogflow.v2beta1.ListCont" +
      "extsResponse\">\202\323\344\223\0028\0226/v2beta1/{parent=p" +
      "rojects/*/agent/sessions/*}/contexts\022\252\001\n" +
      "\nGetContext\0222.google.cloud.dialogflow.v2" +
      "beta1.GetContextRequest\032(.google.cloud.d" +
      "ialogflow.v2beta1.Context\">\202\323\344\223\0028\0226/v2be" +
      "ta1/{name=projects/*/agent/sessions/*/co",
      "ntexts/*}\022\271\001\n\rCreateContext\0225.google.clo" +
      "ud.dialogflow.v2beta1.CreateContextReque" +
      "st\032(.google.cloud.dialogflow.v2beta1.Con" +
      "text\"G\202\323\344\223\002A\"6/v2beta1/{parent=projects/" +
      "*/agent/sessions/*}/contexts:\007context\022\301\001" +
      "\n\rUpdateContext\0225.google.cloud.dialogflo" +
      "w.v2beta1.UpdateContextRequest\032(.google." +
      "cloud.dialogflow.v2beta1.Context\"O\202\323\344\223\002I" +
      "2>/v2beta1/{context.name=projects/*/agen" +
      "t/sessions/*/contexts/*}:\007context\022\236\001\n\rDe",
      "leteContext\0225.google.cloud.dialogflow.v2" +
      "beta1.DeleteContextRequest\032\026.google.prot" +
      "obuf.Empty\">\202\323\344\223\0028*6/v2beta1/{name=proje" +
      "cts/*/agent/sessions/*/contexts/*}\022\246\001\n\021D" +
      "eleteAllContexts\0229.google.cloud.dialogfl" +
      "ow.v2beta1.DeleteAllContextsRequest\032\026.go" +
      "ogle.protobuf.Empty\">\202\323\344\223\0028*6/v2beta1/{p" +
      "arent=projects/*/agent/sessions/*}/conte" +
      "xtsB\252\001\n#com.google.cloud.dialogflow.v2be" +
      "ta1B\014ContextProtoP\001ZIgoogle.golang.org/g",
      "enproto/googleapis/cloud/dialogflow/v2be" +
      "ta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Di" +
      "alogflow.V2beta1b\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_dialogflow_v2beta1_Context_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Context_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_Context_descriptor,
        new java.lang.String[] { "Name", "LifespanCount", "Parameters", });
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListContextsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_ListContextsResponse_descriptor,
        new java.lang.String[] { "Contexts", "NextPageToken", });
    internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_GetContextRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_CreateContextRequest_descriptor,
        new java.lang.String[] { "Parent", "Context", });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_UpdateContextRequest_descriptor,
        new java.lang.String[] { "Context", "UpdateMask", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteContextRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DeleteAllContextsRequest_descriptor,
        new java.lang.String[] { "Parent", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}