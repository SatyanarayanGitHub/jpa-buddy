CREATE TABLE tbl_course (
  course_id BIGINT NOT NULL,
   title VARCHAR(255) NULL,
   credit INT NULL,
   CONSTRAINT pk_tbl_course PRIMARY KEY (course_id)
);


CREATE TABLE tbl_course_material (
  course_material_id BIGINT NOT NULL,
   url VARCHAR(255) NULL,
   course_course_id BIGINT NULL,
   CONSTRAINT pk_tbl_course_material PRIMARY KEY (course_material_id)
);

ALTER TABLE tbl_course_material ADD CONSTRAINT FK_TBL_COURSE_MATERIAL_ON_COURSE_COURSE
FOREIGN KEY (course_course_id) REFERENCES tbl_course (course_id);