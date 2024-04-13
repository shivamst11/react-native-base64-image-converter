#include <jni.h>
#include "react-native-base64-image-converter.h"

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_base64imageconverter_Base64ImageConverterModule_nativeMultiply(JNIEnv *env, jclass type, jdouble a, jdouble b) {
    return base64imageconverter::multiply(a, b);
}
