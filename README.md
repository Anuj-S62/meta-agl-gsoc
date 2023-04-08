# meta-agl-gsoc
custom layer for test app


To run the layer

1. Initializing the build environment:

2. Run the script: \
```shell
$ cd AGL/master \
$ source meta-agl/scripts/aglsetup.sh -m qemux86-64 -b build-gsoc-task agl-demo agl-devel 
```

3. Enable meta-agl-gsoc: \
$ cd AGL/master/build-gsoc-task \
$ bitbake-layers add-layer "path to meta-agl-gsoc" 

4. Build the image: \
$ bitbake agl-demo-platform-gsoc-task 

5. Deploy the image: \
$ cd AGL/master/build-gsoc-task \
$ runqemu kvm serialstdio slirp publicvnc 


6. Deploy the graphics: \
  Open the VNC client \
  Enter the server address as localhost:0 
  
![Screenshot from 2023-04-08 16-13-41](https://user-images.githubusercontent.com/96018337/230718782-8a0bb398-3bd3-4de7-9030-46d27022ff9e.png)

![Screenshot from 2023-04-08 16-13-53](https://user-images.githubusercontent.com/96018337/230718786-3ab52a76-8e20-47e9-9004-4a78c803de7e.png)
