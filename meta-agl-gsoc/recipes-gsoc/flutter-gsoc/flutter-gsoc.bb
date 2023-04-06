SUMMARY = "Flutter GSoC Task"
DESCRIPTION = "Flutter GSoC Task of Automotive Grade Linux"

SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"


SRC_URI = "git://github.com/Anuj-S62/flutterGsocTask.git;protocol=https;branch=master"

SRCREV = "67bd0667a693485d312153476b7524df6d963c76"
S = "${WORKDIR}/git"


inherit agl-app flutter-app

# flutter-app
#############
PUBSPEC_APPNAME = "gsoctask"
FLUTTER_APPLICATION_INSTALL_PREFIX = "/flutter"
FLUTTER_BUILD_ARGS = "bundle -v"

