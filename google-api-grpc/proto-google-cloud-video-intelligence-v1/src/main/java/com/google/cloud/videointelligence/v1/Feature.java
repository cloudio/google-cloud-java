// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

/**
 * <pre>
 * Video annotation feature.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.videointelligence.v1.Feature}
 */
public enum Feature
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified.
   * </pre>
   *
   * <code>FEATURE_UNSPECIFIED = 0;</code>
   */
  FEATURE_UNSPECIFIED(0),
  /**
   * <pre>
   * Label detection. Detect objects, such as dog or flower.
   * </pre>
   *
   * <code>LABEL_DETECTION = 1;</code>
   */
  LABEL_DETECTION(1),
  /**
   * <pre>
   * Shot change detection.
   * </pre>
   *
   * <code>SHOT_CHANGE_DETECTION = 2;</code>
   */
  SHOT_CHANGE_DETECTION(2),
  /**
   * <pre>
   * Explicit content detection.
   * </pre>
   *
   * <code>EXPLICIT_CONTENT_DETECTION = 3;</code>
   */
  EXPLICIT_CONTENT_DETECTION(3),
  /**
   * <pre>
   * Human face detection and tracking.
   * </pre>
   *
   * <code>FACE_DETECTION = 4;</code>
   */
  FACE_DETECTION(4),
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>SPEECH_TRANSCRIPTION = 6;</code>
   */
  SPEECH_TRANSCRIPTION(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified.
   * </pre>
   *
   * <code>FEATURE_UNSPECIFIED = 0;</code>
   */
  public static final int FEATURE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Label detection. Detect objects, such as dog or flower.
   * </pre>
   *
   * <code>LABEL_DETECTION = 1;</code>
   */
  public static final int LABEL_DETECTION_VALUE = 1;
  /**
   * <pre>
   * Shot change detection.
   * </pre>
   *
   * <code>SHOT_CHANGE_DETECTION = 2;</code>
   */
  public static final int SHOT_CHANGE_DETECTION_VALUE = 2;
  /**
   * <pre>
   * Explicit content detection.
   * </pre>
   *
   * <code>EXPLICIT_CONTENT_DETECTION = 3;</code>
   */
  public static final int EXPLICIT_CONTENT_DETECTION_VALUE = 3;
  /**
   * <pre>
   * Human face detection and tracking.
   * </pre>
   *
   * <code>FACE_DETECTION = 4;</code>
   */
  public static final int FACE_DETECTION_VALUE = 4;
  /**
   * <pre>
   * Speech transcription.
   * </pre>
   *
   * <code>SPEECH_TRANSCRIPTION = 6;</code>
   */
  public static final int SPEECH_TRANSCRIPTION_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Feature valueOf(int value) {
    return forNumber(value);
  }

  public static Feature forNumber(int value) {
    switch (value) {
      case 0: return FEATURE_UNSPECIFIED;
      case 1: return LABEL_DETECTION;
      case 2: return SHOT_CHANGE_DETECTION;
      case 3: return EXPLICIT_CONTENT_DETECTION;
      case 4: return FACE_DETECTION;
      case 6: return SPEECH_TRANSCRIPTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Feature>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Feature> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Feature>() {
          public Feature findValueByNumber(int number) {
            return Feature.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Feature[] VALUES = values();

  public static Feature valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Feature(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.videointelligence.v1.Feature)
}

