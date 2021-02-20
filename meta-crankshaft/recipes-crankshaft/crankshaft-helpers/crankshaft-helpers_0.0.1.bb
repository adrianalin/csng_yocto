DESCRIPTION = "Crankshaft Helpers"
SECTION = "libs"
LICENSE = "crankshaft"
HOMEPAGE = "http://getcrankshaft.com"

DEPENDS = "crankshaft"

PR = "r0"
LIC_FILES_CHKSUM = "file://crankshaft;md5=26cb4d70aa81284b5830b20c19d72234"
SRC_URI= "https://raw.githubusercontent.com/opencardev/prebuilts/master/csmt/crankshaft;name=crankshaft \
https://raw.githubusercontent.com/opencardev/prebuilts/master/openauto/autoapp_helper;name=autoapp_helper \
"
SRC_URI[crankshaft.md5sum] = "26cb4d70aa81284b5830b20c19d72234"
SRC_URI[autoapp_helper.md5sum] = "696884d8ea1137895d71cb395ba7be4e"

do_install() {
	install -d ${D}${bindir}
	install -m 0644 ${S}/crankshaft ${D}${bindir}/crankshaft
	install -m 0644 ${S}/autoapp_helper ${D}${bindir}/autoapp_helper
}