DESCRIPTION = "Crankshaft application package group"
SUMMARY = "Crankshaft package group - tools/apps"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    aasdk \
    openauto \
"