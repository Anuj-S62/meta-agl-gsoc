SUMMARY = "Flutter GSoC Task"
DESCRIPTION = "Flutter GSoC Task of Automotive Grade Linux"

SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"


SRC_URI = "git://github.com/Anuj-S62/flutterGsocTask.git;protocol=https;branch=master"

SRCREV = "32965e8de61ccc04ff405358982c54fe2725ae90"
S = "${WORKDIR}/git"

inherit agl-app flutter-app

# flutter-app
############
PUBSPEC_APPNAME = "gsoctask"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"
FLUTTER_BUILD_ARGS = "bundle -v"

#########
AGL_APP_TEMPLATE = "agl-app-flutter"
AGL_APP_ID = "gsoctask"
AGL_APP_NAME = "GsocTask"


    
