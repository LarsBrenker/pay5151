FROM payara/micro:5.2021.1-jdk11
COPY ./target/payara-5151-reproducer.war ${DEPLOY_DIR}