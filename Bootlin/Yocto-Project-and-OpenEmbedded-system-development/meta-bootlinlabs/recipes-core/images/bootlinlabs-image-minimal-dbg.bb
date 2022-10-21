require bootlinlabs-image-minimal.bb
  
DESCRIPTION = "A minimal image capable of booting and having debug facility."

IMAGE_FEATURES += "dbg-pkgs"

IMAGE_INSTALL += "packagegroup-bootlinlabs-debug"
