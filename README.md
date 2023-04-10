# meta-agl-gsoc
custom layer for test app


To run the layer

1. Downlaod Agl software and Initialise the build environment:
[here](https://docs.automotivelinux.org)

2. Run the script: 
```bash
$ cd AGL/master
$ source meta-agl/scripts/aglsetup.sh -m qemux86-64 -b build-gsoc-task agl-demo agl-devel 
```


3. Enable meta-agl-gsoc: 
```shell
$ cd AGL/master/build-gsoc-task 
$ bitbake-layers add-layer "path to meta-agl-gsoc" 
```


4. Build the image: 
```shell
$ bitbake agl-demo-platform-gsoc-task 
```


5. Deploy the image: 
```shell
$ cd AGL/master/build-gsoc-task 
$ runqemu kvm serialstdio slirp publicvnc 
```


6. Deploy the graphics: \
  Open the VNC client \
  Enter the server address as localhost:0 

7. set speed:
  login as root then run kuksa_viss_client
  ```shell
  $ root
  $ kuksa_viss_client
  ```
  
  
![Screenshot from 2023-04-10 23-28-08](https://user-images.githubusercontent.com/96018337/230962358-cebb0382-9c73-424d-81cc-424706b90bd8.png)
![Screenshot from 2023-04-10 23-25-28](https://user-images.githubusercontent.com/96018337/230962082-9d58384e-b75d-4fe8-a8ef-0c3b9faeff93.png)

