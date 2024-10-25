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
    internal_static_org_example_StudentCertRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_StudentCertRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Student_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_StudentsListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_StudentsListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Course_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Course_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_CourseListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_CourseListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_Registration_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_Registration_fieldAccessorTable;
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
      "\n\021ClassSystem.proto\022\013org.example\"7\n\007Requ" +
      "est\022\r\n\005token\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\017\n\007payl" +
      "oad\030\003 \001(\t\".\n\014ResponseList\022\014\n\004type\030\001 \001(\t\022" +
      "\020\n\010Response\030\002 \003(\t\"\033\n\010Response\022\017\n\007message" +
      "\030\001 \001(\t\",\n\022StudentCertRequest\022\n\n\002id\030\001 \001(\t" +
      "\022\n\n\002pw\030\002 \001(\t\"y\n\007Student\022\021\n\tstudentId\030\001 \001" +
      "(\t\022\014\n\004name\030\002 \001(\t\022\022\n\ndepartment\030\003 \001(\t\022\022\n\n" +
      "courseList\030\004 \003(\t\022\n\n\002id\030\005 \001(\t\022\n\n\002pw\030\006 \001(\t" +
      "\022\r\n\005token\030\007 \001(\t\"=\n\024StudentsListResponse\022" +
      "%\n\007student\030\001 \003(\0132\024.org.example.Student\"[" +
      "\n\006Course\022\n\n\002id\030\001 \001(\t\022\021\n\tprofessor\030\002 \001(\t\022" +
      "\021\n\tclassName\030\003 \001(\t\022\020\n\010preClass\030\004 \003(\t\022\r\n\005" +
      "token\030\005 \001(\t\"9\n\022CourseListResponse\022#\n\006cou" +
      "rse\030\001 \003(\0132\023.org.example.Course\"3\n\014Regist" +
      "ration\022\021\n\tstudentId\030\001 \001(\t\022\020\n\010courseId\030\002 " +
      "\003(\t\"K\n\030RegistrationListResponse\022/\n\014regis" +
      "tration\030\001 \003(\0132\031.org.example.Registration" +
      "2N\n\013DataService\022?\n\005login\022\037.org.example.S" +
      "tudentCertRequest\032\025.org.example.Response" +
      "2\314\001\n\016StudentService\022A\n\016getStudentList\022\024." +
      "org.example.Request\032\031.org.example.Respon" +
      "seList\0229\n\naddStudent\022\024.org.example.Stude" +
      "nt\032\025.org.example.Response\022<\n\rdeleteStude" +
      "nt\022\024.org.example.Request\032\025.org.example.R" +
      "esponse2\307\001\n\rCourseService\022@\n\rgetCourseLi" +
      "st\022\024.org.example.Request\032\031.org.example.R" +
      "esponseList\0227\n\taddCourse\022\023.org.example.C" +
      "ourse\032\025.org.example.Response\022;\n\014deleteCo" +
      "urse\022\024.org.example.Request\032\025.org.example" +
      ".Response2R\n\023RegistrationService\022;\n\014regi" +
      "stration\022\024.org.example.Request\032\025.org.exa" +
      "mple.Response2\224\002\n\024ServerStudentService\022I" +
      "\n\016getStudentList\022\024.org.example.Request\032!" +
      ".org.example.StudentsListResponse\0228\n\nget" +
      "Student\022\024.org.example.Request\032\024.org.exam" +
      "ple.Student\0229\n\naddStudent\022\024.org.example." +
      "Request\032\025.org.example.Response\022<\n\rdelete" +
      "Student\022\024.org.example.Request\032\025.org.exam" +
      "ple.Response2\214\002\n\023ServerCourseService\022F\n\r" +
      "getCourseList\022\024.org.example.Request\032\037.or" +
      "g.example.CourseListResponse\0226\n\tgetCours" +
      "e\022\024.org.example.Request\032\023.org.example.Co" +
      "urse\0228\n\taddCourse\022\024.org.example.Request\032" +
      "\025.org.example.Response\022;\n\014deleteCourse\022\024" +
      ".org.example.Request\032\025.org.example.Respo" +
      "nse2\363\001\n\031ServerRegistrationService\022R\n\023get" +
      "RegistrationList\022\024.org.example.Request\032%" +
      ".org.example.RegistrationListResponse\022B\n" +
      "\017getRegistration\022\024.org.example.Request\032\031" +
      ".org.example.Registration\022>\n\017addRegistra" +
      "tion\022\024.org.example.Request\032\025.org.example" +
      ".ResponseB\002P\001b\006proto3"
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
        new java.lang.String[] { "Token", "Type", "Payload", });
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
    internal_static_org_example_StudentCertRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_example_StudentCertRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_StudentCertRequest_descriptor,
        new java.lang.String[] { "Id", "Pw", });
    internal_static_org_example_Student_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_example_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Student_descriptor,
        new java.lang.String[] { "StudentId", "Name", "Department", "CourseList", "Id", "Pw", "Token", });
    internal_static_org_example_StudentsListResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_example_StudentsListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_StudentsListResponse_descriptor,
        new java.lang.String[] { "Student", });
    internal_static_org_example_Course_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_example_Course_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Course_descriptor,
        new java.lang.String[] { "Id", "Professor", "ClassName", "PreClass", "Token", });
    internal_static_org_example_CourseListResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_org_example_CourseListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_CourseListResponse_descriptor,
        new java.lang.String[] { "Course", });
    internal_static_org_example_Registration_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_org_example_Registration_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_Registration_descriptor,
        new java.lang.String[] { "StudentId", "CourseId", });
    internal_static_org_example_RegistrationListResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_org_example_RegistrationListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_RegistrationListResponse_descriptor,
        new java.lang.String[] { "Registration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}