# ecodation_git_tutorials
> git komutları

---

```sh
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/hamitmizrak/ecodation_git_tutorials.git
git push -u origin main
```

---

```sh
stash: add yaptıkran sonra commit öncesinde git tarafında saklanacak veriler demektir.
UNUTMAAAA: stash yapmadan önce  yapmalısın ==> git add .
git stash
git stash list
git stash save "stash adim"
git stash apply stash@{0}

git stash pop 
git stash drop stash@{0}

```

```sh
git stash save "stashAdi"

git reset HEAD~1
git add .
git commit -m "conflict sonrası"
git push --force

```
---

```sh
git branch 

---------------------------------
-- Fast Forward 
git branch frontend
git checkout frontend 
cat >> data.txt
git add .
git commit -m "frontend data"
git push -u origin frontend

git checkout main
git merge frontend (fast forward)

---------------------------------
git checkout -b backend
cat >> data.txt
git add .
git commit -m "backend data"
git push -u origin backend

git checkout main
git merge --no-ff frontend (no-fast forward)
```
