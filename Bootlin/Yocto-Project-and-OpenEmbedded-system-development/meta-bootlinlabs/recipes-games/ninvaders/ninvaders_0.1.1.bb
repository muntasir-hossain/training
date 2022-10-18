require ninvaders.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "https://sourceforge.net/projects/ninvaders/files/ninvaders/0.1.1/ninvaders-0.1.1.tar.gz \
           file://joystick-support.patch \
          "

SRC_URI[sha256sum] = "bfbc5c378704d9cf5e7fed288dac88859149bee5ed0850175759d310b61fd30b"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://gpl.txt;md5=393a5ca445f6965873eca0259a17f833"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS}'" 

do_compile(){
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 nInvaders ${D}${bindir}
}

IMAGE_INSTALL_append = " ${PN}-dbg"

