cmake_minimum_required(VERSION 3.4.1)
project(Base64ImageConverter)

set (CMAKE_VERBOSE_MAKEFILE ON)
set (CMAKE_CXX_STANDARD 14)

add_library(react-native-base64-image-converter            SHARED
            ../cpp/react-native-base64-image-converter.cpp
            cpp-adapter.cpp
)

# Specifies a path to native header files.
include_directories(
            ../cpp
)
