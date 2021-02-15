DESCRIPTION = "Scripts from crankshaft"
SECTION = "libs"
LICENSE = "crankshaft"

DEPENDS = ""

PR = "r0"
LIC_FILES_CHKSUM = "file://README.md;md5=4f71706c758c730491d444715277caa3"
SRC_URI = "git://github.com/opencardev/crankshaft.git;protocol=https;branch=crankshaft-ng; \
           file://0001-Update-to-new-paths-for-yocto-build.patch \
           "
SRCREV = "f815963a333e1493986f8cf4c00cb6d67ebc2daa"

inherit systemd

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}/opt/crankshaft
	install -m 0644 ${S}/stage3/03-crankshaft-base/files/opt/crankshaft/crankshaft_default_env.sh ${D}/opt/crankshaft/
	install -m 0644 ${S}/stage3/03-crankshaft-base/files/opt/crankshaft/crankshaft_system_env.sh ${D}/opt/crankshaft/
	install -m 0755 ${S}/stage3/03-crankshaft-base/files/opt/crankshaft/service_hotspot.sh ${D}/opt/crankshaft/
	install -m 0644 ${S}/stage3/03-crankshaft-base/files/opt/crankshaft/service_hostapdchange.sh ${D}/opt/crankshaft/

	install -d ${D}${systemd_system_unitdir}
	install -m 0644 ${S}/stage3/03-crankshaft-base/files/etc/systemd/system/hotspot-monitor.service ${D}${systemd_system_unitdir}
}

FILES_${PN} += "\
	/opt/crankshaft/ \
	${systemd_system_unitdir} \
"

INSANE_SKIP_${PN} = "file-rdeps"