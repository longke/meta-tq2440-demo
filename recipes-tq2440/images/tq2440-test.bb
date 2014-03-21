include recipes-core/images/core-image-base.bb

#IMAGE_FEATURES += "debug-tweaks"

SOC_EXTRA_IMAGE_FEATURES ?= "tools-testapps"

# Add extra image features
#EXTRA_IMAGE_FEATURES += " \
#   ${SOC_EXTRA_IMAGE_FEATURES} \
#    tools-debug \
#   tools-profile \
#"

IMAGE_INSTALL += " \
	rpm \
"
#packagegroup-tq2440-tools-testapps 
export IMAGE_BASENAME = "tq2440-image-test"
