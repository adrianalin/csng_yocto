SUMMARY = "IVI image sata"

include recipes-sato/images/core-image-sato.bb

IMAGE_FEATURES += "package-management splash"

CORE_OS = " \
    libinput-dev \
"

WIFI_SUPPORT = " \
	packagegroup-base \
	iw \
	linux-firmware-bcm43430 \
	wpa-supplicant \
	init-ifupdown \
	wpa-supplicant \
"

QT_DEV = " \
	qtbase-dev \
	qtbase-mkspecs \
	qtdeclarative \
	qtmultimedia \
	qtquickcontrols2 \
	qtquickcontrols2-dev \
	qtquickcontrols2-mkspecs \
	qtquickcontrols \
	qtbase-plugins \
	qtconnectivity-dev \
	qtconnectivity-mkspecs \
	qtmultimedia-dev \
	qtmultimedia-mkspecs \
	qtmultimedia-plugins \
"

GST_DEV = " \
	gstreamer1.0-plugins-base \
	gstreamer1.0-plugins-good \
	gstreamer1.0-plugins-ugly \
"

IMAGE_INSTALL += " \
	${CORE_OS} \
	${WIFI_SUPPORT} \
	${GST_DEV} \
	${QT_DEV} \
	librtaudio \
	openauto \
"
