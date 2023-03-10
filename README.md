# Introduction

This a work-in-progress project bringing Prey 2006 game into VR (on Oculus Quest 2).

Running this game require a copy of the original Prey 2006 data. Tested on English version patched with 1.4 patch.

Copy the `base` folder from the original game into the headset as `PreyVR/preybase`.

![PreyVR Banner](https://github.com/lvonasek/Doom3Quest/blob/master/app/src/main/res/drawable/ic_launcher.png?raw=true)

Logo created by madrapper: https://www.deviantart.com/madrapper/art/Prey-Icon-129814229


===

# How was it done

The work is based on DrBeef's Doom3Quest and this project: https://github.com/glKarin/com.n0n3m4.diii4a
(last updated from https://github.com/glKarin/com.n0n3m4.diii4a/commit/93d6fd6314a48bd544ec0262801c415a8990034a).

As DrBeef's and glKarin's use different versions of idTech4A++ engine, in this repo I merged them together.

Current status (in `app/src/main/jni/d3es-multithread-master/neo/`):

* cm - merged
* framework - merged
* game - this is per game different
* idlib - merged
* MayaImport - merged
* renderer - backported
* sound - kept
* sys - adjusted
* tools - merged
* TypeInfo - merged
* ui - merged

Note that this version is not backward compatible with DrBeef's Doom3Quest. It uses different format for save games.

===

# Original README

Doom 3 Quest is based on the excellent port from Emile Belanger (https://github.com/emileb), with multithreaded front end and backend renderering, with an updated renderer to OpenGL ES 3.0 to take advantage of MultiView to dramatically improve VR rendering performance, and many VR specific enhancements (see below).

Originally forked from: https://github.com/emileb/d3es-multithread

This port includes many of the fantastic features from the **Doom 3 BFG Fully Possessed Mod**: https://github.com/KozGit/DOOM-3-BFG-VR
After we had ported the original Doom 3 to the Quest, we realised that a lot of the really cool features in the PCVR port could be brought across that would add a lot of value. Things like the inverse kinematics (arms and body movements), immersive cinematics, weapons and body models, touchscreen UI in the game and the PDA.  So a lot of effort was put into bringing them across to Doom3Quest, so we didn't have to write them from scratch, but they took a lot of effort to bring over. So many thanke to the Fully Possessed team for their extremely hard work in creating a lot of the features in the first place.

This is built solely for the Oculus Quest 1 and 2 VR HMDs and will **not** run on any other device.

The easiest way to install this on your Quest is using SideQuest, a Desktop app designed to simplify sideloading apps and games on the Oculus Quest and Oculus Quest 2.
Download SideQuest here:
https://github.com/the-expanse/SideQuest/releases



IMPORTANT NOTE
--------------

This is just an engine port; the apk does not contain any of the of Doom 3 assets. If you wish to play the full game you must purchase it yourself, steam is most straightforward:  https://store.steampowered.com/app/9050/DOOM_3/

**THIS PORT WILL NOT RUN WITH THE BFG EDITION, ONLY THE ORIGINAL DOOM 3 PK4 FILES WILL WORK**


INSTALLATION AND SETUP
----------------------

Please see the official Doom 3 Quest website for full details: https://www.doom3quest.com/


CREDITS
-------

I would like to thank the following teams and individual for making this possible:

* **Emile Belanger / emileb** - For once again providing the android port upon which this is based. See his other Android ports here
* **Baggyg** - My long-time VR friend whose roles in this have been varied and all helpful. His main responsibility this port was bringing over VR weapons and features from Fully Possessed as well some BFG core code enhancements. Also the creator of excellent websites/artwork/assets for this mod.
* **VR_Bummser** - PR person extraordinaire, video creation, play tester and all round helpful and good guy. Hoping I can buy him a beer in person one day!
* **The Fully Possessed Team (Samson / KozGit)** - This mod includes features (too many to mention but main ones include Reverse IK, Physical Menu Interaction and Immersive Cinematics), assets (VR weapons and hands) and has functionality that were inspired by the PCVR Fully Possessed Mod. That project is still active and has exciting things around the corner. If you want to play Doom 3 BFG on PC (rather than Doom 3 on Quest natively) this is a highly recommended experience.
* **The SideQuest team** - For making it easy for people to install this
