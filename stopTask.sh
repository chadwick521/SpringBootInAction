#!/bin/sh
kill $(cat ./pid.file)
rm pid.file
rm nohup.out
