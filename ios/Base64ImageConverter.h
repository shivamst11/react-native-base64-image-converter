#ifdef __cplusplus
#import "react-native-base64-image-converter.h"
#endif

#ifdef RCT_NEW_ARCH_ENABLED
#import "RNBase64ImageConverterSpec.h"

@interface Base64ImageConverter : NSObject <NativeBase64ImageConverterSpec>
#else
#import <React/RCTBridgeModule.h>

@interface Base64ImageConverter : NSObject <RCTBridgeModule>
#endif

@end
