How to publish to Maven Central
===============================

Releases are deployed to the Sonatype **Central Portal** (https://central.sonatype.com)
via the JReleaser Gradle plugin (configured in `build.gradle`). The old OSSRH flow
(`s01.oss.sonatype.org` + manual "close/release") is no longer used — OSSRH has been
retired.

Prerequisites
-------------
- A Central Portal account with a generated **user token**
  (central.sonatype.com -> profile -> *Generate User Token*). The legacy OSSRH
  credentials (`s01.oss.sonatype.org`) do NOT work against the Central Portal — a 401
  during deploy almost always means an OSSRH/wrong token is being used.
- The `com.linbit` namespace must be verified for that account on the Central Portal
  (the published groupId `com.linbit.linstor.api` lives under it).
- A GPG key for signing — JReleaser signs every artifact (`signing.active = ALWAYS`),
  and the matching public key must be published to a keyserver (e.g. keys.openpgp.org)
  so the Portal can verify the signatures.
- Credentials passed to JReleaser via environment variables. Run

      ./gradlew jreleaserEnv

  to print the exact names it expects:

      JRELEASER_MAVENCENTRAL_SONATYPE_USERNAME   # Central Portal token username
      JRELEASER_MAVENCENTRAL_SONATYPE_TOKEN      # Central Portal token password
      JRELEASER_GPG_SECRET_KEY                   # armored secret key (signs the artifacts)
      JRELEASER_GPG_PASSPHRASE                   # passphrase for the secret key

  (Only the secret key is needed — `JRELEASER_GPG_PUBLIC_KEY` was deprecated in
  JReleaser 1.24.0. These can also live in `~/.jreleaser/config.properties`.)

Steps
-----
1. Set the release `version` in `build.gradle` (no `-SNAPSHOT`); commit and tag.

2. Build and stage the artifacts into the local staging repo:

       ./gradlew clean publish

   This writes the jar, `-sources`, `-javadoc` and `.pom` under `build/staging-deploy`.

3. Sign and upload to the Central Portal:

       ./gradlew jreleaserDeploy

   Validate the configuration first with `./gradlew jreleaserConfig`. Use
   `./gradlew jreleaserFullRelease` instead if you also want JReleaser to create the
   matching Git release.

4. Check the deployment at https://central.sonatype.com/ (*Deployments*) and publish it
   if your portal namespace is not set to auto-publish.

Note
----
The staging directory must be the same on both sides. `publish` writes to
`build/staging-deploy` (`layout.buildDirectory`), so the JReleaser
`stagingRepository(...)` in `build.gradle` must point at `build/staging-deploy` too —
otherwise `jreleaserDeploy` uploads nothing.
