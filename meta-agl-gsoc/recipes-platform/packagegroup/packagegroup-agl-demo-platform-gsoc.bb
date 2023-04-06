DESCRIPTION = "My Custom Package Groups"

inherit packagegroup

PACKAGES = "\
    ${PN}-apps \
    "

RDEPENDS:${PN}-apps = "\
    flutter-gsoc
    "
