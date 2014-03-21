# Copyright (C) 2012-2013 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r0"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES += " \
    ${PN}-tools-testapps \
"
RDEPENDS_${PN}-tools-testapps = " \
    alsa-utils \
    alsa-tools \
    e2fsprogs-mke2fs \
    i2c-tools \
    iproute2 \
    memtester \
    ethtool \
    mtd-utils \
    mtd-utils-ubifs \
"

# Disabled as it has CRC problems in denzil branch
#    cpuburn-neon

ALLOW_EMPTY_${PN} = "1"
ALLOW_EMPTY_${PN}-tools-testapps = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"
