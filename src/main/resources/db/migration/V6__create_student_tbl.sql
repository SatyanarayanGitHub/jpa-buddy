-- for Postgres db
-- CREATE SEQUENCE  IF NOT EXISTS student_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE tbl_student (
  student_id BIGINT NOT NULL AUTO_INCREMENT,
   first_name VARCHAR(255) NULL,
   last_name VARCHAR(255) NULL,
   email_id VARCHAR(255) NOT NULL,
   guardian_name VARCHAR(255) NULL,
   guardian_email VARCHAR(255) NULL,
   guardian_mobile VARCHAR(255) NULL,
   CONSTRAINT pk_tbl_student PRIMARY KEY (student_id)
);

ALTER TABLE tbl_student ADD CONSTRAINT uc_student_email_id UNIQUE (email_id);

