@echo off

podman-compose down -v && podman-compose up -d

pause >nul
