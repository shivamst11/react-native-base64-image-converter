cmake_minimum_required(VERSION 3.9.0)
project(Base64ImageConverter)
set(PACKAGE_NAME "Base64ImageConverter")
set(BUILD_DIR ${CMAKE_SOURCE_DIR}/build)
set(CMAKE_VERBOSE_MAKEFILE ON)

set (CMAKE_VERBOSE_MAKEFILE ON)
set (CMAKE_CXX_STANDARD 20)

find_package(ReactAndroid REQUIRED CONFIG)
find_package(fbjni REQUIRED CONFIG)
find_library(LOG_LIB log)


add_library( ${PACKAGE_NAME}            SHARED
            cpp-adapter.cpp
        ../cpp/base64.cpp

)

# Specifies a path to native header files.
include_directories(
            "${NODE_MODULES_DIR}/react-native/"
            "${NODE_MODULES_DIR}/react-native/React/Base"
            "${NODE_MODULES_DIR}/react-native/ReactCommon/jsi"
            ../cpp
)
#
#find_library(
#        JSI_LIB
#        jsi
#
#)
#
#find_library(
#        REACT_NATIVE_JNI_LIB
#        reactnativejni
#)



set_target_properties(
        ${PACKAGE_NAME} PROPERTIES
        CXX_STANDARD 20
        CXX_EXTENSIONS OFF
        POSITION_INDEPENDENT_CODE ON
)

target_link_libraries(
        ${PACKAGE_NAME}
        android
        ${LOG_LIB}
        ReactAndroid::jsi                   # <-- RN: JSI
        ReactAndroid::reactnativejni        # <-- RN: React Native JNI bindings
        fbjni::fbjni                        # <-- fbjni
)
