require recipes-platform/images/agl-image-ivi.bb

DESCRIPTION = "AGL Flutter based Demo Platform image"

require recipes-platform/images/agl-demo-features.inc

# add packages for demo platform (include demo apps) here
IMAGE_INSTALL:append = " \
    packagegroup-agl-demo-platform-gsoc \
    weston-ini-conf-flutter \
    ${@bb.utils.contains("AGL_FEATURES", "agl-demo-preload", "", "weston-terminal-conf", d)} \
"
