
Faced this because have already pushed the code to the gitlab so afterwards didn't removed the remote origin

D:\Regular Download\AirTribe\LearnerManagementSystem>git remote add origin https://github.com/110502/LearnerManagementSystem.git
error: remote origin already exists.

D:\Regular Download\AirTribe\LearnerManagementSystem>git remote -v
origin  https://gitlab.com/na-group8014952/lms.git (fetch)
origin  https://gitlab.com/na-group8014952/lms.git (push)





After removing the remote origin

D:\Regular Download\AirTribe\LearnerManagementSystem>git remote remove origin

D:\Regular Download\AirTribe\LearnerManagementSystem>git remote add origin https://github.com/110502/LearnerManagementSystem.git

D:\Regular Download\AirTribe\LearnerManagementSystem>git remote -v
origin  https://github.com/110502/LearnerManagementSystem.git (fetch)
origin  https://github.com/110502/LearnerManagementSystem.git (push)


In below steps have faced the issue of pull and push multiplpe times have kept this logs for the reference purpose 


D:\Regular Download\AirTribe\LearnerManagementSystem>branch -M LMS
'branch' is not recognized as an internal or external command,
operable program or batch file.

D:\Regular Download\AirTribe\LearnerManagementSystem>git branch -M LMS

D:\Regular Download\AirTribe\LearnerManagementSystem>git push -u origin LMS
info: please complete authentication in your browser...
To https://github.com/110502/LearnerManagementSystem.git
! [rejected]        LMS -> LMS (fetch first)
error: failed to push some refs to 'https://github.com/110502/LearnerManagementSystem.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

D:\Regular Download\AirTribe\LearnerManagementSystem>git push -u origin LMS
To https://github.com/110502/LearnerManagementSystem.git
! [rejected]        LMS -> LMS (fetch first)
error: failed to push some refs to 'https://github.com/110502/LearnerManagementSystem.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

D:\Regular Download\AirTribe\LearnerManagementSystem>git pull
remote: Enumerating objects: 6, done.
remote: Counting objects: 100% (6/6), done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 6 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (6/6), 2.91 KiB | 198.00 KiB/s, done.
From https://github.com/110502/LearnerManagementSystem
* [new branch]      LMS        -> origin/LMS
* [new branch]      main       -> origin/main
  There is no tracking information for the current branch.
  Please specify which branch you want to merge with.
  See git-pull(1) for details.

  git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branch> LMS


D:\Regular Download\AirTribe\LearnerManagementSystem>git branch --set-upstream-to=origin/LMS
branch 'LMS' set up to track 'origin/LMS'.

D:\Regular Download\AirTribe\LearnerManagementSystem>git pull
fatal: refusing to merge unrelated histories

D:\Regular Download\AirTribe\LearnerManagementSystem>git branch
* LMS

D:\Regular Download\AirTribe\LearnerManagementSystem>git push
To https://github.com/110502/LearnerManagementSystem.git
! [rejected]        LMS -> LMS (non-fast-forward)
error: failed to push some refs to 'https://github.com/110502/LearnerManagementSystem.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. If you want to integrate the remote changes,
hint: use 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

D:\Regular Download\AirTribe\LearnerManagementSystem>git pull origin LMS --allow-unrelated-histories
From https://github.com/110502/LearnerManagementSystem
* branch            LMS        -> FETCH_HEAD
  error: Your local changes to the following files would be overwritten by merge:
  .classpath .idea/runConfigurations/LMS.xml .project Docker.txt Git Command.txt GitHub.md LearnerManagementSystem.iml out/production/LearnerManagementSystem/LearnerManagement/LMSMain.class out/production/LearnerManagementSystem/LearnerManagement/LMSRouter.class out/production/LearnerManagementSystem/enums/EnrollmentStatus.class out/production/LearnerManagementSystem/models/CourseDTO.class out/production/LearnerManagementSystem/models/EnrollmentDTO.class out/production/LearnerManagementSystem/models/StudentDTO.class out/production/LearnerManagementSystem/repository/CourseRepo.class out/production/LearnerManagementSystem/repository/EnrollmentRepo.class out/production/LearnerManagementSystem/repository/StudentRepo.class out/production/LearnerManagementSystem/service/CourseService.class out/production/LearnerManagementSystem/service/EnrollmentService.class out/production/LearnerManagementSystem/service/StudentService.class out/production/LearnerManagementSystem/serviceImpl/CourseServiceImpl.class out/production/LearnerManagementSystem/serviceImpl/EnrollmentServiceImpl.class out/production/LearnerManagementSystem/serviceImpl/StudentServiceImpl.class out/production/LearnerManagementSystem/utility/BasicMethods.class src/serviceImpl/EnrollmentServiceImpl.java
  Merge with strategy ort failed.

D:\Regular Download\AirTribe\LearnerManagementSystem>git add .

D:\Regular Download\AirTribe\LearnerManagementSystem>git commit -m "Merge remote LMS with local project"
[LMS 4d00d80] Merge remote LMS with local project
25 files changed, 156 insertions(+), 102 deletions(-)
create mode 100644 .classpath
create mode 100644 .idea/runConfigurations/LMS.xml
create mode 100644 .project
create mode 100644 Docker.txt
create mode 100644 GitHub.md
delete mode 100644 out/production/LearnerManagementSystem/LearnerManagement/LMSMain.class
delete mode 100644 out/production/LearnerManagementSystem/LearnerManagement/LMSRouter.class
delete mode 100644 out/production/LearnerManagementSystem/enums/EnrollmentStatus.class
delete mode 100644 out/production/LearnerManagementSystem/models/CourseDTO.class
delete mode 100644 out/production/LearnerManagementSystem/models/EnrollmentDTO.class
delete mode 100644 out/production/LearnerManagementSystem/models/StudentDTO.class
delete mode 100644 out/production/LearnerManagementSystem/repository/CourseRepo.class
delete mode 100644 out/production/LearnerManagementSystem/repository/EnrollmentRepo.class
delete mode 100644 out/production/LearnerManagementSystem/repository/StudentRepo.class
delete mode 100644 out/production/LearnerManagementSystem/service/CourseService.class
delete mode 100644 out/production/LearnerManagementSystem/service/EnrollmentService.class
delete mode 100644 out/production/LearnerManagementSystem/service/StudentService.class
delete mode 100644 out/production/LearnerManagementSystem/serviceImpl/CourseServiceImpl.class
delete mode 100644 out/production/LearnerManagementSystem/serviceImpl/EnrollmentServiceImpl.class
delete mode 100644 out/production/LearnerManagementSystem/serviceImpl/StudentServiceImpl.class
delete mode 100644 out/production/LearnerManagementSystem/utility/BasicMethods.class

D:\Regular Download\AirTribe\LearnerManagementSystem>git push origin LMS
To https://github.com/110502/LearnerManagementSystem.git
! [rejected]        LMS -> LMS (non-fast-forward)
error: failed to push some refs to 'https://github.com/110502/LearnerManagementSystem.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. If you want to integrate the remote changes,
hint: use 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

D:\Regular Download\AirTribe\LearnerManagementSystem>
D:\Regular Download\AirTribe\LearnerManagementSystem>
D:\Regular Download\AirTribe\LearnerManagementSystem>git push origin LMS --force
Enumerating objects: 147, done.
Counting objects: 100% (147/147), done.
Delta compression using up to 8 threads
Compressing objects: 100% (129/129), done.
Writing objects: 100% (147/147), 35.00 KiB | 1.40 MiB/s, done.
Total 147 (delta 39), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (39/39), done.
To https://github.com/110502/LearnerManagementSystem.git
+ 28ac441...4d00d80 LMS -> LMS (forced update)

D:\Regular Download\AirTribe\LearnerManagementSystem>



D:\Regular Download\AirTribe\LearnerManagementSystem>git add .

D:\Regular Download\AirTribe\LearnerManagementSystem>git commit -m "Merge GitHub file"
[LMS c59f3d9] Merge GitHub file
1 file changed, 150 insertions(+)

D:\Regular Download\AirTribe\LearnerManagementSystem>git push origin LMS
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 1.95 KiB | 1.95 MiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/DevSani0502/LearnerManagementSystem.git
4d00d80..c59f3d9  LMS -> LMS




pushed the same code in the main branch

D:\Regular Download\AirTribe\LearnerManagementSystem>git add .

D:\Regular Download\AirTribe\LearnerManagementSystem>git commit -m "Save local changes before switching branches"
[LMS c665123] Save local changes before switching branches
1 file changed, 20 insertions(+), 1 deletion(-)

D:\Regular Download\AirTribe\LearnerManagementSystem>git checkout main
branch 'main' set up to track 'origin/main'.
Switched to a new branch 'main'

D:\Regular Download\AirTribe\LearnerManagementSystem>
D:\Regular Download\AirTribe\LearnerManagementSystem>
D:\Regular Download\AirTribe\LearnerManagementSystem>
D:\Regular Download\AirTribe\LearnerManagementSystem>git merge LMS --allow-unrelated-histories
Auto-merging README.md
CONFLICT (add/add): Merge conflict in README.md
Automatic merge failed; fix conflicts and then commit the result.

D:\Regular Download\AirTribe\LearnerManagementSystem>git push origin main
Everything up-to-date

D:\Regular Download\AirTribe\LearnerManagementSystem>git push origin LMS:main --force
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 544 bytes | 544.00 KiB/s, done.
Total 3 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/DevSani0502/LearnerManagementSystem.git
+ 3249c8a...c665123 LMS -> main (forced update)
