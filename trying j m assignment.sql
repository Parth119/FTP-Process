create or alter procedure sql.stData
@student_id int = 0,
@obtainedMarks float = 0
as
begin
	if @student_id = 0 and @obtainedMarks = 0
	begin
		select sm.StudentId,sm.StudentName,subm.SubjectName,sr.ObtainedMarks
		from sql.studentMast sm
		left join sql.StudentResult sr
		on sm.StudentId = sr.StudentId
		left join sql.SubjectMast subm
		on sr.SubjectId = subm.SubjectId
	end
	else if @student_id !=0 and @obtainedMarks = 0
		begin
			select sm.StudentId,sm.StudentName,subm.SubjectName,sr.ObtainedMarks
			from sql.studentMast sm
			left join sql.StudentResult sr
			on sm.StudentId = sr.StudentId
			left join sql.SubjectMast subm
			on sr.SubjectId = subm.SubjectId
			where sr.StudentId = @student_id
		end
	else if @obtainedMarks != 0 and @student_id !=0
		begin
			select sm.StudentId,sm.StudentName,subm.SubjectName,sr.ObtainedMarks
			from sql.studentMast sm
			left join sql.StudentResult sr
			on sm.StudentId = sr.StudentId
			left join sql.SubjectMast subm
			on sr.SubjectId = subm.SubjectId
			where sr.StudentId = @student_id and
			sr.ObtainedMarks >= @obtainedMarks
		end
end

--exec sql.stData @student_id = 0, @obtainedMarks = 0