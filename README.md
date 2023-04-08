# meta-agl-gsoc
custom layer for test app


To run the layer

1. Initializing the build environment:

2. Run the script: \
$ cd AGL/master
$ source meta-agl/scripts/aglsetup.sh -m qemux86-64 -b build-gsoc-task agl-demo agl-devel

3. Enable meta-agl-gsoc :
$ cd AGL/master/build-gsoc-task
$ bitbake-layers add-layer "path to meta-agl-gsoc" 

4. Build the image
$ bitbake agl-demo-platform-gsoc-task

5. Deploy the image
$ cd AGL/master/build-gsoc-task
$ runqemu kvm serialstdio slirp publicvnc

6. Deploy the graphics
  Open the VNC client
  Enter the server address as localhost:0
