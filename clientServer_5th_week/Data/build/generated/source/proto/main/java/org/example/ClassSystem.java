// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClassSystem.proto

package org.example;

public final class ClassSystem {
  private ClassSystem() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_ResponseList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_ResponseList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_StudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_StudentsListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_StudentsListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_CourseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_CourseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_CourseListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_CourseListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_RegistrationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_RegistrationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_RegistrationListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_RegistrationListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ClassSystem.proto\022\013org.example\"(\n\007Requ" +
      "est\022\014\n\004type\030\002 \001(\t\022\017\n\007payload\030\003 \001(\t\".\n\014Re" +
      "sponseList\022\014\n\004type\030\001 \001(\t\022\020\n\010Response\030\002 \003" +
      "(\t\"\033\n\010Response\022\017\n\007message\030\001 \001(\t\"r\n\017Stude" +
      "ntResponse\022\021\n\tstudentId\030\001 \001(\t\022\014\n\004name\030\002 " +
      "\001(\t\022\022\n\ndepartment\030\003 \001(\t\022\022\n\ncourseList\030\004 " +
      "\003(\t\022\n\n\002id\030\005 \001(\t\022\n\n\002pw\030\006 \001(\t\"E\n\024StudentsL" +
      "istResponse\022-\n\007student\030\001 \003(\0132\034.org.examp" +
      "le.StudentResponse\"T\n\016CourseResponse\022\n\n\002" +
      "id\030\001 \001(\t\022\021\n\tprofessor\030\002 \001(\t\022\021\n\tclassName" +
      "\030\003 \001(\t\022\020\n\010preClass\030\004 \003(\t\"A\n\022CourseListRe" +
      "sponse\022+\n\006course\030\001 \003(\0132\033.org.example.Cou" +
      "rseResponse\";\n\024RegistrationResponse\022\021\n\ts" +
      "tudentId\030\001 \001(\t\022\020\n\010courseId\030\002 \003(\t\"S\n\030Regi" +
      "strationListResponse\0227\n\014registration\030\001 \003" +
      "(\0132!.org.example.RegistrationResponse2\234\002" +
      "\n\024ServerStudentService\022I\n\016getStudentList" +
      "\022\024.org.example.Request\032!.org.example.Stu" +
      "dentsListResponse\022@\n\ngetStudent\022\024.org.ex" +
      "ample.Request\032\034.org.example.StudentRespo" +
      "nse\0229\n\naddStudent\022\024.org.example.Request\032" +
      "\025.org.example.Response\022<\n\rdeleteStudent\022" +
      "\024.org.example.Request\032\025.org.example.Resp" +
      "onse2\224\002\n\023ServerCourseService\022F\n\rgetCours" +
      "eList\022\024.org.example.Request\032\037.org.exampl" +
      "e.CourseListResponse\022>\n\tgetCourse\022\024.org." +
      "example.Request\032\033.org.example.CourseResp" +
      "onse\0228\n\taddCourse\022\024.org.example.Request\032" +
      "\025.org.example.Response\022;\n\014deleteCourse\022\024" +
      ".org.example.Request\032\025.org.example.Respo" +
      "nse2\373\001\n\031ServerRegistrationService\022R\n\023get" +
      "RegistrationList\022\024.org.example.Request\032%" +
      ".org.example.RegistrationListResponse\022J\n" +
      "\017getRegistration\022\024.org.example.Request\032!" +
      ".org.example.RegistrationResponse\022>\n\017add" +
      "Registration\022\024.org.example.Request\032\025.org" +
      ".example.ResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_example_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Request_descriptor,
        new java.lang.String[] { "Type", "Payload", });
    internal_static_org_example_ResponseList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_ResponseList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_ResponseList_descriptor,
        new java.lang.String[] { "Type", "Response", });
    internal_static_org_example_Response_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_example_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Response_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_org_example_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_example_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_StudentResponse_descriptor,
        new java.lang.String[] { "StudentId", "Name", "Department", "CourseList", "Id", "Pw", });
    internal_static_org_example_StudentsListResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_example_StudentsListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_StudentsListResponse_descriptor,
        new java.lang.String[] { "Student", });
    internal_static_org_example_CourseResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_example_CourseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_CourseResponse_descriptor,
        new java.lang.String[] { "Id", "Professor", "ClassName", "PreClass", });
    internal_static_org_example_CourseListResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_example_CourseListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_CourseListResponse_descriptor,
        new java.lang.String[] { "Course", });
    internal_static_org_example_RegistrationResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_org_example_RegistrationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_RegistrationResponse_descriptor,
        new java.lang.String[] { "StudentId", "CourseId", });
    internal_static_org_example_RegistrationListResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_org_example_RegistrationListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_RegistrationListResponse_descriptor,
        new java.lang.String[] { "Registration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
