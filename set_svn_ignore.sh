#!/bin/bash

svn propset svn:ignore -F .svnignore .
(cd gradle/wrapper	&& svn propset svn:ignore -F .svnignore .)
(cd .idea	&& svn propset svn:ignore -F .svnignore .)