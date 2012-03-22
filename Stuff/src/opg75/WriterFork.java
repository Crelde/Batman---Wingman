package opg75;

import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class WriterFork extends Writer {
	Writer WriterA;
	Writer WriterB;

	public WriterFork(Writer writerA, Writer writerB) {
		WriterA = writerA;
		WriterB = writerB;
	}

	@Override
	public void close() throws IOException {
		WriterA.close();
		WriterB.close();

	}

	@Override
	public void flush() throws IOException {
	WriterA.flush();
	WriterB.flush();

	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		WriterA.write(cbuf, off, len);
		WriterB.write(cbuf, off, len);

	}

}
