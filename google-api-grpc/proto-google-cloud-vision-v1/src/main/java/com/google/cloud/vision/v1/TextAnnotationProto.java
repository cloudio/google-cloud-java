// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/text_annotation.proto

package com.google.cloud.vision.v1;

public final class TextAnnotationProto {
  private TextAnnotationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_TextAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_TextAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_TextAnnotation_DetectedLanguage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_TextAnnotation_DetectedLanguage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_TextAnnotation_DetectedBreak_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_TextAnnotation_DetectedBreak_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_TextAnnotation_TextProperty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_TextAnnotation_TextProperty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_Page_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_Page_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_Block_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_Block_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_Paragraph_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_Paragraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_Word_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_Word_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vision_v1_Symbol_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vision_v1_Symbol_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/vision/v1/text_annotation" +
      ".proto\022\026google.cloud.vision.v1\032\034google/a" +
      "pi/annotations.proto\032%google/cloud/visio" +
      "n/v1/geometry.proto\"\226\004\n\016TextAnnotation\022+" +
      "\n\005pages\030\001 \003(\0132\034.google.cloud.vision.v1.P" +
      "age\022\014\n\004text\030\002 \001(\t\032=\n\020DetectedLanguage\022\025\n" +
      "\rlanguage_code\030\001 \001(\t\022\022\n\nconfidence\030\002 \001(\002" +
      "\032\325\001\n\rDetectedBreak\022L\n\004type\030\001 \001(\0162>.googl" +
      "e.cloud.vision.v1.TextAnnotation.Detecte" +
      "dBreak.BreakType\022\021\n\tis_prefix\030\002 \001(\010\"c\n\tB",
      "reakType\022\013\n\007UNKNOWN\020\000\022\t\n\005SPACE\020\001\022\016\n\nSURE" +
      "_SPACE\020\002\022\022\n\016EOL_SURE_SPACE\020\003\022\n\n\006HYPHEN\020\004" +
      "\022\016\n\nLINE_BREAK\020\005\032\261\001\n\014TextProperty\022S\n\022det" +
      "ected_languages\030\001 \003(\01327.google.cloud.vis" +
      "ion.v1.TextAnnotation.DetectedLanguage\022L" +
      "\n\016detected_break\030\002 \001(\01324.google.cloud.vi" +
      "sion.v1.TextAnnotation.DetectedBreak\"\257\001\n" +
      "\004Page\022E\n\010property\030\001 \001(\01323.google.cloud.v" +
      "ision.v1.TextAnnotation.TextProperty\022\r\n\005" +
      "width\030\002 \001(\005\022\016\n\006height\030\003 \001(\005\022-\n\006blocks\030\004 ",
      "\003(\0132\035.google.cloud.vision.v1.Block\022\022\n\nco" +
      "nfidence\030\005 \001(\002\"\346\002\n\005Block\022E\n\010property\030\001 \001" +
      "(\01323.google.cloud.vision.v1.TextAnnotati" +
      "on.TextProperty\022:\n\014bounding_box\030\002 \001(\0132$." +
      "google.cloud.vision.v1.BoundingPoly\0225\n\np" +
      "aragraphs\030\003 \003(\0132!.google.cloud.vision.v1" +
      ".Paragraph\022;\n\nblock_type\030\004 \001(\0162\'.google." +
      "cloud.vision.v1.Block.BlockType\022\022\n\nconfi" +
      "dence\030\005 \001(\002\"R\n\tBlockType\022\013\n\007UNKNOWN\020\000\022\010\n" +
      "\004TEXT\020\001\022\t\n\005TABLE\020\002\022\013\n\007PICTURE\020\003\022\t\n\005RULER",
      "\020\004\022\013\n\007BARCODE\020\005\"\317\001\n\tParagraph\022E\n\010propert" +
      "y\030\001 \001(\01323.google.cloud.vision.v1.TextAnn" +
      "otation.TextProperty\022:\n\014bounding_box\030\002 \001" +
      "(\0132$.google.cloud.vision.v1.BoundingPoly" +
      "\022+\n\005words\030\003 \003(\0132\034.google.cloud.vision.v1" +
      ".Word\022\022\n\nconfidence\030\004 \001(\002\"\316\001\n\004Word\022E\n\010pr" +
      "operty\030\001 \001(\01323.google.cloud.vision.v1.Te" +
      "xtAnnotation.TextProperty\022:\n\014bounding_bo" +
      "x\030\002 \001(\0132$.google.cloud.vision.v1.Boundin" +
      "gPoly\022/\n\007symbols\030\003 \003(\0132\036.google.cloud.vi",
      "sion.v1.Symbol\022\022\n\nconfidence\030\004 \001(\002\"\255\001\n\006S" +
      "ymbol\022E\n\010property\030\001 \001(\01323.google.cloud.v" +
      "ision.v1.TextAnnotation.TextProperty\022:\n\014" +
      "bounding_box\030\002 \001(\0132$.google.cloud.vision" +
      ".v1.BoundingPoly\022\014\n\004text\030\003 \001(\t\022\022\n\nconfid" +
      "ence\030\004 \001(\002Bt\n\032com.google.cloud.vision.v1" +
      "B\023TextAnnotationProtoP\001Z<google.golang.o" +
      "rg/genproto/googleapis/cloud/vision/v1;v" +
      "ision\370\001\001b\006proto3"
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
          com.google.cloud.vision.v1.GeometryProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_vision_v1_TextAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vision_v1_TextAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_TextAnnotation_descriptor,
        new java.lang.String[] { "Pages", "Text", });
    internal_static_google_cloud_vision_v1_TextAnnotation_DetectedLanguage_descriptor =
      internal_static_google_cloud_vision_v1_TextAnnotation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_vision_v1_TextAnnotation_DetectedLanguage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_TextAnnotation_DetectedLanguage_descriptor,
        new java.lang.String[] { "LanguageCode", "Confidence", });
    internal_static_google_cloud_vision_v1_TextAnnotation_DetectedBreak_descriptor =
      internal_static_google_cloud_vision_v1_TextAnnotation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_vision_v1_TextAnnotation_DetectedBreak_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_TextAnnotation_DetectedBreak_descriptor,
        new java.lang.String[] { "Type", "IsPrefix", });
    internal_static_google_cloud_vision_v1_TextAnnotation_TextProperty_descriptor =
      internal_static_google_cloud_vision_v1_TextAnnotation_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_vision_v1_TextAnnotation_TextProperty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_TextAnnotation_TextProperty_descriptor,
        new java.lang.String[] { "DetectedLanguages", "DetectedBreak", });
    internal_static_google_cloud_vision_v1_Page_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vision_v1_Page_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_Page_descriptor,
        new java.lang.String[] { "Property", "Width", "Height", "Blocks", "Confidence", });
    internal_static_google_cloud_vision_v1_Block_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vision_v1_Block_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_Block_descriptor,
        new java.lang.String[] { "Property", "BoundingBox", "Paragraphs", "BlockType", "Confidence", });
    internal_static_google_cloud_vision_v1_Paragraph_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vision_v1_Paragraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_Paragraph_descriptor,
        new java.lang.String[] { "Property", "BoundingBox", "Words", "Confidence", });
    internal_static_google_cloud_vision_v1_Word_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_vision_v1_Word_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_Word_descriptor,
        new java.lang.String[] { "Property", "BoundingBox", "Symbols", "Confidence", });
    internal_static_google_cloud_vision_v1_Symbol_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_vision_v1_Symbol_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vision_v1_Symbol_descriptor,
        new java.lang.String[] { "Property", "BoundingBox", "Text", "Confidence", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.vision.v1.GeometryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
