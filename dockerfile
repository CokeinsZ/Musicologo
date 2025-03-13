FROM python:3.11

RUN apt-get update && apt-get install -y ffmpeg
RUN pip install antlr4-python3-runtime pydub ffmpeg-python

WORKDIR /app
COPY . /app

VOLUME ["/app/archivos"]

CMD ["python", "src/main.py"]