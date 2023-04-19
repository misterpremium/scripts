#!/bin/bash
sudo pacman -Syu
sudo pacman -S yay discord virtualbox virtualbox-guest-iso thunderbird corectrl steam lutris plasma-systemmonitor telegram-desktop obs-studio flameshot gparted base-devel
sudo pacman -S mesa lib32-mesa vulkan-radeon mesa-vdpau lib32-vulkan-radeon lib32-mesa-vdpau libva-mesa-driver lib32-libva-mesa-driver
#sudo pacman -S wine-staging giflib lib32-giflib libpng lib32-libpng libldap lib32-libldap gnutls lib32-gnutls mpg123 lib32-mpg123 openal lib32-openal v4l-utils lib32-v4l-utils libpulse lib32-libpulse libgpg-error lib32-libgpg-error alsa-plugins lib32-alsa-plugins alsa-lib lib32-alsa-lib libjpeg-turbo lib32-libjpeg-turbo sqlite lib32-sqlite libxcomposite lib32-libxcomposite libxinerama lib32-libgcrypt libgcrypt lib32-libxinerama ncurses lib32-ncurses opencl-icd-loader lib32-opencl-icd-loader libxslt lib32-libxslt libva lib32-libva gtk3 lib32-gtk3 gst-plugins-base-libs lib32-gst-plugins-base-libs vulkan-icd-loader lib32-vulkan-icd-loader --needed


yay -S spotify teams-for-linux joplin sublime-text-4 chiaki anydesk-bin tor-browser google-chrome

cp -r .ssh/* /home/misterpremium/.ssh/
cp -r .steam /home/misterpremium/
cp -r .minecraft /home/misterpremium/

cp .conky .bash_history .bashrc /home/misterpremium/
cp 'Plantilla_Solicitud_MASI_Servicio de Transferencia de Ficheros_1.2 .xlsx' /home/misterpremium/
cp frontalextranet.pub backendcpd.pub frontalintranet.pub /home/misterpremium/


#.config
cp -r .config/joplin-desktop /home/misterpremium/.config/
cp -r .config/discor /home/misterpremium/.config/
cp -r .config/google-chrome /home/misterpremium/.config/
cp -r .config/VirtualBox /home/misterpremium/.config/
cp -r .config/vlc /home/misterpremium/.config/
cp -r .config/Chiaki /home/misterpremium/.config/
cp -r .config/teams-for-linux /home/misterpremium/.config/
cp -r .config/heroic /home/misterpremium/.config/
cp -r .config/KeePass /home/misterpremium/.config/
cp -r .config/corectrl /home/misterpremium/.config/
cp -r .config/rpcs3 /home/misterpremium/.config/
cp -r .config/obs-studio /home/misterpremium/.config/
cp -r .config/desmume /home/misterpremium/.config/
cp -r .config/qBittorrent /home/misterpremium/.config/
cp -r .config/citra-emu /home/misterpremium/.config/
cp -r .config/visualboyadvance-m /home/misterpremium/.config/
cp -r .config/spicetify /home/misterpremium/.config/
cp -r .config/dolphin-emu /home/misterpremium/.config/
cp -r .config/autostart /home/misterpremium/.config/
cp -r .config/sublime-text-3 /home/misterpremium/.config/
cp -r .config/lutris /home/misterpremium/.config/
cp -r .config/aacs /home/misterpremium/.config/
cp -r .config/joplin /home/misterpremium/.config/
cp -r .config/calibre /home/misterpremium/.config/
cp -r .config/@joplin /home/misterpremium/.config/
cp -r .config/PCSX2 /home/misterpremium/.config/
cp -r .config/ppsspp /home/misterpremium/.config/
#Directorios Staticos
cp -r Documentos/* /home/misterpremium/Documentos/
cp -r Imágenes/* /home/misterpremium/Imágenes/
cp -r Descargas/* /home/misterpremium/Descargas/
cp -r Applications /home/misterpremium/Applications
cp -r Vídeos /home/misterpremium/Vídeos
cp -r Música /home/misterpremium/Música
cp -r 'Biblioteca de calibre' /home/misterpremium/
cp -r Games /home/misterpremium/
#.local entero
cp -r .local/* /home/mistepremium/.local/


