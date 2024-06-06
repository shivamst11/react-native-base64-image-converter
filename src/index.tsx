//@ts-ignore we want to ignore everything
// else in global except what we need to access.
// Maybe there is a better way to do this.
import { NativeModules } from 'react-native';

interface IModule {
  imageToBase64(url: string): string;
}
//@ts-ignore

export const { imageToBase64 } = global as unknown as IModule;

NativeModules.Base64ImageConverter?.install();
