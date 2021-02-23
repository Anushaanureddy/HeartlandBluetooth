/********* HeartlandBluetooth.m Cordova Plugin Implementation *******/

#import <Cordova/CDV.h>

@interface HeartlandBluetooth : CDVPlugin {
  // Member variables go here.
}

- (void)coolMethod:(CDVInvokedUrlCommand*)command;
- (void)add:(CDVInvokedUrlCommand*)command;
@end

@implementation HeartlandBluetooth
- (void)add:(CDVInvokedUrlCommand*)command
{
   CDVPluginResult* pluginResult= nil;
   NSNumber *param1 =  [command.arguments objectAtIndex:0] valueforKey:@"param1"];
   NSNumber *param2 =  [command.arguments objectAtIndex:0] valueforKey:@"param2"]; 
if(param1>=0 && param2 >=0){
NSString* total = @(param1 + param2);
pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:total];
}else{
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
}
self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

- (void)substract:(CDVInvokedUrlCommand*)command
{
   CDVPluginResult* pluginResult= nil;
   NSNumber *param1 =  [command.arguments objectAtIndex:0] valueforKey:@"param1"];
   NSNumber *param2 =  [command.arguments objectAtIndex:0] valueforKey:@"param2"]; 
if(param1>=0 && param2 >=0){
NSString* total = @(param1 - param2);
pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:total];
}else{
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
}
self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
