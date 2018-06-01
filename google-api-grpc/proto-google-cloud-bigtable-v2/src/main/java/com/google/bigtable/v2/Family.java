// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

/**
 * <pre>
 * Specifies (some of) the contents of a single row/column family intersection
 * of a table.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.Family}
 */
public  final class Family extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.Family)
    FamilyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Family.newBuilder() to construct.
  private Family(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Family() {
    name_ = "";
    columns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Family(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              columns_ = new java.util.ArrayList<com.google.bigtable.v2.Column>();
              mutable_bitField0_ |= 0x00000002;
            }
            columns_.add(
                input.readMessage(com.google.bigtable.v2.Column.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        columns_ = java.util.Collections.unmodifiableList(columns_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Family_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Family_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.Family.class, com.google.bigtable.v2.Family.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The unique key which identifies this family within its row. This is the
   * same key that's used to identify the family in, for example, a RowFilter
   * which sets its "family_name_regex_filter" field.
   * Must match `[-_.a-zA-Z0-9]+`, except that AggregatingRowProcessors may
   * produce cells in a sentinel family with an empty name.
   * Must be no greater than 64 characters in length.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique key which identifies this family within its row. This is the
   * same key that's used to identify the family in, for example, a RowFilter
   * which sets its "family_name_regex_filter" field.
   * Must match `[-_.a-zA-Z0-9]+`, except that AggregatingRowProcessors may
   * produce cells in a sentinel family with an empty name.
   * Must be no greater than 64 characters in length.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMNS_FIELD_NUMBER = 2;
  private java.util.List<com.google.bigtable.v2.Column> columns_;
  /**
   * <pre>
   * Must not be empty. Sorted in order of increasing "qualifier".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
   */
  public java.util.List<com.google.bigtable.v2.Column> getColumnsList() {
    return columns_;
  }
  /**
   * <pre>
   * Must not be empty. Sorted in order of increasing "qualifier".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
   */
  public java.util.List<? extends com.google.bigtable.v2.ColumnOrBuilder> 
      getColumnsOrBuilderList() {
    return columns_;
  }
  /**
   * <pre>
   * Must not be empty. Sorted in order of increasing "qualifier".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
   */
  public int getColumnsCount() {
    return columns_.size();
  }
  /**
   * <pre>
   * Must not be empty. Sorted in order of increasing "qualifier".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
   */
  public com.google.bigtable.v2.Column getColumns(int index) {
    return columns_.get(index);
  }
  /**
   * <pre>
   * Must not be empty. Sorted in order of increasing "qualifier".
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
   */
  public com.google.bigtable.v2.ColumnOrBuilder getColumnsOrBuilder(
      int index) {
    return columns_.get(index);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < columns_.size(); i++) {
      output.writeMessage(2, columns_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < columns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, columns_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.bigtable.v2.Family)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.Family other = (com.google.bigtable.v2.Family) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getColumnsList()
        .equals(other.getColumnsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getColumnsCount() > 0) {
      hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getColumnsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.Family parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Family parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Family parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Family parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Family parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.Family parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.Family parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Family parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.Family parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Family parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.v2.Family parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.v2.Family parseFrom(
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
  public static Builder newBuilder(com.google.bigtable.v2.Family prototype) {
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
   * Specifies (some of) the contents of a single row/column family intersection
   * of a table.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.Family}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.Family)
      com.google.bigtable.v2.FamilyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Family_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Family_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.Family.class, com.google.bigtable.v2.Family.Builder.class);
    }

    // Construct using com.google.bigtable.v2.Family.newBuilder()
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
        getColumnsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      if (columnsBuilder_ == null) {
        columns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        columnsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_Family_descriptor;
    }

    public com.google.bigtable.v2.Family getDefaultInstanceForType() {
      return com.google.bigtable.v2.Family.getDefaultInstance();
    }

    public com.google.bigtable.v2.Family build() {
      com.google.bigtable.v2.Family result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.v2.Family buildPartial() {
      com.google.bigtable.v2.Family result = new com.google.bigtable.v2.Family(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (columnsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          columns_ = java.util.Collections.unmodifiableList(columns_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.columns_ = columns_;
      } else {
        result.columns_ = columnsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v2.Family) {
        return mergeFrom((com.google.bigtable.v2.Family)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.Family other) {
      if (other == com.google.bigtable.v2.Family.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (columnsBuilder_ == null) {
        if (!other.columns_.isEmpty()) {
          if (columns_.isEmpty()) {
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureColumnsIsMutable();
            columns_.addAll(other.columns_);
          }
          onChanged();
        }
      } else {
        if (!other.columns_.isEmpty()) {
          if (columnsBuilder_.isEmpty()) {
            columnsBuilder_.dispose();
            columnsBuilder_ = null;
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000002);
            columnsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColumnsFieldBuilder() : null;
          } else {
            columnsBuilder_.addAllMessages(other.columns_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.bigtable.v2.Family parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.Family) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The unique key which identifies this family within its row. This is the
     * same key that's used to identify the family in, for example, a RowFilter
     * which sets its "family_name_regex_filter" field.
     * Must match `[-_.a-zA-Z0-9]+`, except that AggregatingRowProcessors may
     * produce cells in a sentinel family with an empty name.
     * Must be no greater than 64 characters in length.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique key which identifies this family within its row. This is the
     * same key that's used to identify the family in, for example, a RowFilter
     * which sets its "family_name_regex_filter" field.
     * Must match `[-_.a-zA-Z0-9]+`, except that AggregatingRowProcessors may
     * produce cells in a sentinel family with an empty name.
     * Must be no greater than 64 characters in length.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique key which identifies this family within its row. This is the
     * same key that's used to identify the family in, for example, a RowFilter
     * which sets its "family_name_regex_filter" field.
     * Must match `[-_.a-zA-Z0-9]+`, except that AggregatingRowProcessors may
     * produce cells in a sentinel family with an empty name.
     * Must be no greater than 64 characters in length.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique key which identifies this family within its row. This is the
     * same key that's used to identify the family in, for example, a RowFilter
     * which sets its "family_name_regex_filter" field.
     * Must match `[-_.a-zA-Z0-9]+`, except that AggregatingRowProcessors may
     * produce cells in a sentinel family with an empty name.
     * Must be no greater than 64 characters in length.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique key which identifies this family within its row. This is the
     * same key that's used to identify the family in, for example, a RowFilter
     * which sets its "family_name_regex_filter" field.
     * Must match `[-_.a-zA-Z0-9]+`, except that AggregatingRowProcessors may
     * produce cells in a sentinel family with an empty name.
     * Must be no greater than 64 characters in length.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.bigtable.v2.Column> columns_ =
      java.util.Collections.emptyList();
    private void ensureColumnsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        columns_ = new java.util.ArrayList<com.google.bigtable.v2.Column>(columns_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.bigtable.v2.Column, com.google.bigtable.v2.Column.Builder, com.google.bigtable.v2.ColumnOrBuilder> columnsBuilder_;

    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public java.util.List<com.google.bigtable.v2.Column> getColumnsList() {
      if (columnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(columns_);
      } else {
        return columnsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public int getColumnsCount() {
      if (columnsBuilder_ == null) {
        return columns_.size();
      } else {
        return columnsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public com.google.bigtable.v2.Column getColumns(int index) {
      if (columnsBuilder_ == null) {
        return columns_.get(index);
      } else {
        return columnsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder setColumns(
        int index, com.google.bigtable.v2.Column value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.set(index, value);
        onChanged();
      } else {
        columnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder setColumns(
        int index, com.google.bigtable.v2.Column.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.set(index, builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder addColumns(com.google.bigtable.v2.Column value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.add(value);
        onChanged();
      } else {
        columnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder addColumns(
        int index, com.google.bigtable.v2.Column value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.add(index, value);
        onChanged();
      } else {
        columnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder addColumns(
        com.google.bigtable.v2.Column.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.add(builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder addColumns(
        int index, com.google.bigtable.v2.Column.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.add(index, builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder addAllColumns(
        java.lang.Iterable<? extends com.google.bigtable.v2.Column> values) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, columns_);
        onChanged();
      } else {
        columnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder clearColumns() {
      if (columnsBuilder_ == null) {
        columns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        columnsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public Builder removeColumns(int index) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.remove(index);
        onChanged();
      } else {
        columnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public com.google.bigtable.v2.Column.Builder getColumnsBuilder(
        int index) {
      return getColumnsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public com.google.bigtable.v2.ColumnOrBuilder getColumnsOrBuilder(
        int index) {
      if (columnsBuilder_ == null) {
        return columns_.get(index);  } else {
        return columnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public java.util.List<? extends com.google.bigtable.v2.ColumnOrBuilder> 
         getColumnsOrBuilderList() {
      if (columnsBuilder_ != null) {
        return columnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(columns_);
      }
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public com.google.bigtable.v2.Column.Builder addColumnsBuilder() {
      return getColumnsFieldBuilder().addBuilder(
          com.google.bigtable.v2.Column.getDefaultInstance());
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public com.google.bigtable.v2.Column.Builder addColumnsBuilder(
        int index) {
      return getColumnsFieldBuilder().addBuilder(
          index, com.google.bigtable.v2.Column.getDefaultInstance());
    }
    /**
     * <pre>
     * Must not be empty. Sorted in order of increasing "qualifier".
     * </pre>
     *
     * <code>repeated .google.bigtable.v2.Column columns = 2;</code>
     */
    public java.util.List<com.google.bigtable.v2.Column.Builder> 
         getColumnsBuilderList() {
      return getColumnsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.bigtable.v2.Column, com.google.bigtable.v2.Column.Builder, com.google.bigtable.v2.ColumnOrBuilder> 
        getColumnsFieldBuilder() {
      if (columnsBuilder_ == null) {
        columnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.bigtable.v2.Column, com.google.bigtable.v2.Column.Builder, com.google.bigtable.v2.ColumnOrBuilder>(
                columns_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        columns_ = null;
      }
      return columnsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.Family)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.Family)
  private static final com.google.bigtable.v2.Family DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.Family();
  }

  public static com.google.bigtable.v2.Family getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Family>
      PARSER = new com.google.protobuf.AbstractParser<Family>() {
    public Family parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Family(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Family> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Family> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.v2.Family getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

